package com.devry.portal.service.http;

import com.devry.portal.service.RestServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.devry.portal.service.RestServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Gwowen Fu
 * @see RestServiceHttp
 * @see com.devry.portal.service.RestServiceUtil
 * @generated
 */
public class RestServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(RestServiceSoap.class);

    public static java.lang.String get(java.lang.String path)
        throws RemoteException {
        try {
            com.liferay.portal.kernel.json.JSONObject returnValue = RestServiceUtil.get(path);

            return returnValue.toString();
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String get(java.lang.String path,
        java.lang.String username, java.lang.String password)
        throws RemoteException {
        try {
            com.liferay.portal.kernel.json.JSONObject returnValue = RestServiceUtil.get(path,
                    username, password);

            return returnValue.toString();
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String post(java.lang.String path,
        java.lang.String post) throws RemoteException {
        try {
            com.liferay.portal.kernel.json.JSONObject returnValue = RestServiceUtil.post(path,
                    post);

            return returnValue.toString();
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String post(java.lang.String path,
        java.lang.String post, java.lang.String username,
        java.lang.String password) throws RemoteException {
        try {
            com.liferay.portal.kernel.json.JSONObject returnValue = RestServiceUtil.post(path,
                    post, username, password);

            return returnValue.toString();
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String updateStatus(java.lang.String body)
        throws RemoteException {
        try {
            com.liferay.portal.kernel.json.JSONObject returnValue = RestServiceUtil.updateStatus(body);

            return returnValue.toString();
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String delete(java.lang.String path)
        throws RemoteException {
        try {
            com.liferay.portal.kernel.json.JSONObject returnValue = RestServiceUtil.delete(path);

            return returnValue.toString();
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String getVersion() throws RemoteException {
        try {
            java.lang.String returnValue = RestServiceUtil.getVersion();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
