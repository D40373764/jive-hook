package com.devry.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RestLocalService}.
 *
 * @author Gwowen Fu
 * @see RestLocalService
 * @generated
 */
public class RestLocalServiceWrapper implements RestLocalService,
    ServiceWrapper<RestLocalService> {
    private RestLocalService _restLocalService;

    public RestLocalServiceWrapper(RestLocalService restLocalService) {
        _restLocalService = restLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _restLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _restLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _restLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Send request to Jive
    * Sample URLs
    * places
    * places/1003
    * activities?count=1&fields=object,content
    * announcements?count=1&fields=publishDate,content,subject
    */
    @Override
    public com.liferay.portal.kernel.json.JSONObject get(java.lang.String url) {
        return _restLocalService.get(url);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject get(java.lang.String url,
        java.lang.String username, java.lang.String password) {
        return _restLocalService.get(url, username, password);
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
    @Override
    public com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post) {
        return _restLocalService.post(path, post);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post,
        java.lang.String username, java.lang.String password) {
        return _restLocalService.post(path, post, username, password);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject updateStatus(
        java.lang.String body) {
        return _restLocalService.updateStatus(body);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject delete(
        java.lang.String path) {
        return _restLocalService.delete(path);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RestLocalService getWrappedRestLocalService() {
        return _restLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRestLocalService(RestLocalService restLocalService) {
        _restLocalService = restLocalService;
    }

    @Override
    public RestLocalService getWrappedService() {
        return _restLocalService;
    }

    @Override
    public void setWrappedService(RestLocalService restLocalService) {
        _restLocalService = restLocalService;
    }
}
