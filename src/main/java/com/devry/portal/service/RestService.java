package com.devry.portal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for Rest. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Gwowen Fu
 * @see RestServiceUtil
 * @see com.devry.portal.service.base.RestServiceBaseImpl
 * @see com.devry.portal.service.impl.RestServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface RestService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RestServiceUtil} to access the rest remote service. Add custom service methods to {@link com.devry.portal.service.impl.RestServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.kernel.json.JSONObject get(java.lang.String path);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.kernel.json.JSONObject get(
        java.lang.String path, java.lang.String username,
        java.lang.String password);

    public com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post);

    public com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post,
        java.lang.String username, java.lang.String password);

    public com.liferay.portal.kernel.json.JSONObject updateStatus(
        java.lang.String body);

    public com.liferay.portal.kernel.json.JSONObject delete(
        java.lang.String path);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String getVersion();
}
