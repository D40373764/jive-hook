package com.devry.portal.service.base;

import com.devry.portal.service.RestServiceUtil;

import java.util.Arrays;

/**
 * @author Gwowen Fu
 * @generated
 */
public class RestServiceClpInvoker {
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName20;
    private String[] _methodParameterTypes20;
    private String _methodName21;
    private String[] _methodParameterTypes21;
    private String _methodName22;
    private String[] _methodParameterTypes22;
    private String _methodName23;
    private String[] _methodParameterTypes23;
    private String _methodName24;
    private String[] _methodParameterTypes24;
    private String _methodName25;
    private String[] _methodParameterTypes25;
    private String _methodName26;
    private String[] _methodParameterTypes26;

    public RestServiceClpInvoker() {
        _methodName16 = "getBeanIdentifier";

        _methodParameterTypes16 = new String[] {  };

        _methodName17 = "setBeanIdentifier";

        _methodParameterTypes17 = new String[] { "java.lang.String" };

        _methodName20 = "get";

        _methodParameterTypes20 = new String[] { "java.lang.String" };

        _methodName21 = "get";

        _methodParameterTypes21 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String"
            };

        _methodName22 = "post";

        _methodParameterTypes22 = new String[] {
                "java.lang.String", "java.lang.String"
            };

        _methodName23 = "post";

        _methodParameterTypes23 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String"
            };

        _methodName24 = "updateStatus";

        _methodParameterTypes24 = new String[] { "java.lang.String" };

        _methodName25 = "delete";

        _methodParameterTypes25 = new String[] { "java.lang.String" };

        _methodName26 = "getVersion";

        _methodParameterTypes26 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return RestServiceUtil.getBeanIdentifier();
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            RestServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName20.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
            return RestServiceUtil.get((java.lang.String) arguments[0]);
        }

        if (_methodName21.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
            return RestServiceUtil.get((java.lang.String) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName22.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
            return RestServiceUtil.post((java.lang.String) arguments[0],
                (java.lang.String) arguments[1]);
        }

        if (_methodName23.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
            return RestServiceUtil.post((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.lang.String) arguments[3]);
        }

        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            return RestServiceUtil.updateStatus((java.lang.String) arguments[0]);
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            return RestServiceUtil.delete((java.lang.String) arguments[0]);
        }

        if (_methodName26.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
            return RestServiceUtil.getVersion();
        }

        throw new UnsupportedOperationException();
    }
}
