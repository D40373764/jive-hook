package com.devry.portal.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Rest. This utility wraps
 * {@link com.devry.portal.service.impl.RestLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Gwowen Fu
 * @see RestLocalService
 * @see com.devry.portal.service.base.RestLocalServiceBaseImpl
 * @see com.devry.portal.service.impl.RestLocalServiceImpl
 * @generated
 */
public class RestLocalServiceUtil {
    private static RestLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.devry.portal.service.impl.RestLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Send request to Jive
    * Sample URLs
    * places
    * places/1003
    * activities?count=1&fields=object,content
    * announcements?count=1&fields=publishDate,content,subject
    */
    public static com.liferay.portal.kernel.json.JSONObject get(
        java.lang.String url) {
        return getService().get(url);
    }

    public static com.liferay.portal.kernel.json.JSONObject get(
        java.lang.String url, java.lang.String username,
        java.lang.String password) {
        return getService().get(url, username, password);
    }

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
    public static com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post) {
        return getService().post(path, post);
    }

    public static com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post,
        java.lang.String username, java.lang.String password) {
        return getService().post(path, post, username, password);
    }

    public static com.liferay.portal.kernel.json.JSONObject updateStatus(
        java.lang.String body) {
        return getService().updateStatus(body);
    }

    public static com.liferay.portal.kernel.json.JSONObject delete(
        java.lang.String path) {
        return getService().delete(path);
    }

    public static void clearService() {
        _service = null;
    }

    public static RestLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RestLocalService.class.getName());

            if (invokableLocalService instanceof RestLocalService) {
                _service = (RestLocalService) invokableLocalService;
            } else {
                _service = new RestLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RestLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RestLocalService service) {
    }
}
