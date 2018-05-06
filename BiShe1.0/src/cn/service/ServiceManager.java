package cn.service;

public class ServiceManager
{
	private LoginService loginService;

	
	
	public LoginService getLoginService()
	{
		return loginService;
	}

	public void setLoginService(LoginService loginService)
	{
		this.loginService = loginService;
	}
	
}
