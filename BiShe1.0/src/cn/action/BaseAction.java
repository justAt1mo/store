package cn.action;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import cn.bean.Login;
import cn.service.ServiceManager;

public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware
{
	protected ServiceManager serviceManager;
	protected Login login;
	protected String result;
	protected Map<String, String> cookies;
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	@Override
	public void setServletResponse(HttpServletResponse response)
	{
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request)
	{
		// TODO Auto-generated method stub
		this.request = request;
	}
	protected String getCookieValue(String name)
	{
		Cookie cookies[] = request.getCookies();
		if(cookies != null)
		{
			for(Cookie cookie : cookies)
			{
				if(!cookie.getName().equals(name))
				{
					continue;
				}
				return cookie.getValue();
			}
		}
		return null;
	}

	public String getResult()
	{
		return result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}
	public void setServiceManager(ServiceManager serviceManager)
	{
		this.serviceManager = serviceManager;
	}
	public void setLogin(Login login)
	{
		this.login = login;
	}
	protected void saveCookie(String name, String value, int maxAge)
	{
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(maxAge);
		response.addCookie(cookie);
	}
}
