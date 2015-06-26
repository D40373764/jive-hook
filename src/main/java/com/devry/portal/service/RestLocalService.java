package com.devry.portal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service interface for Rest. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Gwowen Fu
 * @see RestLocalServiceUtil
 * @see com.devry.portal.service.base.RestLocalServiceBaseImpl
 * @see com.devry.portal.service.impl.RestLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface RestLocalService extends BaseLocalService, InvokableLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RestLocalServiceUtil} to access the rest local service. Add custom service methods to {@link com.devry.portal.service.impl.RestLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    /**
    * Send request to Jive
    * Sample URLs
    * places
    * places/1003
    * activities?count=1&fields=object,content
    * announcements?count=1&fields=publishDate,content,subject
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.kernel.json.JSONObject get(java.lang.String url);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.kernel.json.JSONObject get(java.lang.String url,
        java.lang.String username, java.lang.String password);

    /**
    * Create post. See https://developers.jivesoftware.com/api/v3/cloud/rest/PostEntity.html
    *
    * Example:
    * path = 'contents'
    * post = '
    * {
    *   "content":
    *  {
    *    "type": "text/html",
    *    "text": "<body><p>Some interesting text</p></body>"
    *  },
    *  "type": "update",
    *  "visibility": "place",
    *  "parent": "https://devrygroup.jiveon.com/api/core/v3/places/1021"
    * }'
    */
    public com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post);

    public com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post,
        java.lang.String username, java.lang.String password);

    public com.liferay.portal.kernel.json.JSONObject updateStatus(
        java.lang.String body);

    public com.liferay.portal.kernel.json.JSONObject delete(
        java.lang.String path);
}
