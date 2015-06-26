package com.devry.portal.service.messaging;

import com.devry.portal.service.ClpSerializer;
import com.devry.portal.service.RestLocalServiceUtil;
import com.devry.portal.service.RestServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            RestLocalServiceUtil.clearService();

            RestServiceUtil.clearService();
        }
    }
}
