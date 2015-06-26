package com.devry.portal.service.impl;

import com.devry.portal.service.RestLocalServiceUtil;
import com.devry.portal.service.base.RestServiceBaseImpl;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * The implementation of the rest remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.devry.portal.service.RestService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Gwowen Fu
 * @see com.devry.portal.service.base.RestServiceBaseImpl
 * @see com.devry.portal.service.RestServiceUtil
 */
public class RestServiceImpl
  extends RestServiceBaseImpl
{
	public JSONObject get(String path)
	{
	  return RestLocalServiceUtil.get(path);
	}
	
	public JSONObject get(String path, String username, String password)
	{
	  return RestLocalServiceUtil.get(path, username, password);
	}
	
	public JSONObject post(String path, String post)
	{
	  return RestLocalServiceUtil.post(path, post);
	}
	
	public JSONObject post(String path, String post, String username, String password)
	{
	  return RestLocalServiceUtil.post(path, post, username, password);
	}
	
	public JSONObject updateStatus(String body)
	{
	  return RestLocalServiceUtil.updateStatus(body);
	}
	
	public JSONObject delete(String path)
	{
	  return RestLocalServiceUtil.delete(path);
	}
	
	public String getVersion()
	{
	  return "0.3";
	}
}