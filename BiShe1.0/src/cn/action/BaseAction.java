package cn.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import cn.service.ServiceManager;

public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware
{
	protected ServiceManager serviceManager;
	protected 
}
