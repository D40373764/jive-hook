package com.devry.portal.service.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import com.devry.portal.service.base.RestLocalServiceBaseImpl;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * The implementation of the rest local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.devry.portal.service.RestLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Gwowen Fu
 * @see com.devry.portal.service.base.RestLocalServiceBaseImpl
 * @see com.devry.portal.service.RestLocalServiceUtil
 */
public class RestLocalServiceImpl extends RestLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.devry.portal.service.RestLocalServiceUtil} to access the rest local service.
     */
	
	HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("gfu@devrygroup.com", "Devry123");
	Client client = ClientBuilder.newClient();
	
	private static String BASE_URL = "https://devrygroup.jiveon.com/api/core/v3";
	
	@Override
	public void afterPropertiesSet() {
		client.register(feature);
		super.afterPropertiesSet();
	}

	/**
	 * Send request to Jive 
	 * Sample URLs
	 * places
	 * places/1003
	 * activities?count=1&fields=object,content
	 * announcements?count=1&fields=publishDate,content,subject
	 * 
	 */
	public JSONObject get(String url) {
		
		String path = url;
		String paramString = null;
		String[] params = null;

		int paramIndexStart = url.indexOf('?');

		if (paramIndexStart > -1) {
			path = url.substring(0, paramIndexStart);
			paramString = url.substring(paramIndexStart + 1);
			params = paramString.split("&");
		}

        WebTarget target = client.target(BASE_URL).path(path);
        
        // Set query params
        if (null != params) {
        	
        	String[] temp;
        	
        	for (int i=0; i < params.length; i++) {
        		temp = params[i].split("=");
        		target = target.queryParam(temp[0], temp[1]);
        	}
        }
        
    	Response response = target
    			.request(MediaType.APPLICATION_JSON_TYPE)
    			.get();

		JSONObject json = JSONFactoryUtil.createJSONObject();

    	if (response.getStatus() == 200) {
    		String message = response.readEntity(String.class);
    		
    		response.close();
    		
            message = message.substring(message.indexOf("{"))
            		.replaceAll("\\n\\s*", "");
            
            try {
				return JSONFactoryUtil.createJSONObject(message);
			} catch (JSONException e) {
				json.put("error", e.getMessage());
			}
    	}
    	else {
    		json.put("status", response.getStatus());
    	}
   	
		return json;		
	}

	public JSONObject get(String url, String username, String password) {
		feature = HttpAuthenticationFeature.basic(username, password);
		return get(url);
	}

	/**
	 * Create post. See https://developers.jivesoftware.com/api/v3/cloud/rest/PostEntity.html
	 * 
	 * Example:
	 * path = 'contents'
	 * post = '
	 * {
  	 *   "content":
     *	 {
     *	   "type": "text/html",
     *	   "text": "<body><p>Some interesting text</p></body>"
     *	 },
     *	 "type": "update",
  	 *	 "visibility": "place",
  	 *	 "parent": "https://devrygroup.jiveon.com/api/core/v3/places/1021"
	 * }'
	 */
	public JSONObject post(String path, String post) {
		
        WebTarget target = client.target(BASE_URL).path(path);
       
    	Response response = target
    			.request(MediaType.APPLICATION_JSON_TYPE)
    			.post(Entity.entity(post, MediaType.APPLICATION_JSON_TYPE));
  	
		JSONObject json = JSONFactoryUtil.createJSONObject();
		json.put("status", response.getStatus());
		json.put("response", response.toString());
		return json;
	}


	public JSONObject post(String path, String post, String username, String password) {
		feature = HttpAuthenticationFeature.basic(username, password);		
		return post(path, post);
	}
	
	  public JSONObject updateStatus(String body)
	  {
	    WebTarget target = this.client.target(BASE_URL).path("contents");
	    
	    String post = "{\"type\": \"update\", \"content\": {\"type\": \"text/html\", \"text\": \"<body><p>" + body + "</p></body>\"} }";
	    
	    Response response = target
	      .request(new MediaType[] {MediaType.APPLICATION_JSON_TYPE })
	      .post(Entity.entity(post, "application/json"));
	    
	    JSONObject json = JSONFactoryUtil.createJSONObject();
	    json.put("status", response.getStatus());
	    json.put("response", response.toString());
	    return json;
	  }
	  
	  public JSONObject delete(String path)
	  {
	    WebTarget target = this.client.target(BASE_URL).path(path);
	    
	    Response response = target
	      .request(new MediaType[] {MediaType.APPLICATION_JSON_TYPE })
	      .delete();
	    
	    JSONObject json = JSONFactoryUtil.createJSONObject();
	    json.put("status", response.getStatus());
	    json.put("response", response.toString());
	    return json;
	  }	
}
