package com.devry.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RestService}.
 *
 * @author Gwowen Fu
 * @see RestService
 * @generated
 */
public class RestServiceWrapper implements RestService,
    ServiceWrapper<RestService> {
    private RestService _restService;

    public RestServiceWrapper(RestService restService) {
        _restService = restService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _restService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _restService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _restService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject get(java.lang.String path) {
        return _restService.get(path);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject get(
        java.lang.String path, java.lang.String username,
        java.lang.String password) {
        return _restService.get(path, username, password);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post) {
        return _restService.post(path, post);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject post(
        java.lang.String path, java.lang.String post,
        java.lang.String username, java.lang.String password) {
        return _restService.post(path, post, username, password);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject updateStatus(
        java.lang.String body) {
        return _restService.updateStatus(body);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject delete(
        java.lang.String path) {
        return _restService.delete(path);
    }

    @Override
    public java.lang.String getVersion() {
        return _restService.getVersion();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RestService getWrappedRestService() {
        return _restService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRestService(RestService restService) {
        _restService = restService;
    }

    @Override
    public RestService getWrappedService() {
        return _restService;
    }

    @Override
    public void setWrappedService(RestService restService) {
        _restService = restService;
    }
}
