package cn.service.impl;

import cn.bean.Login;
import cn.dao.LoginDAO;
import cn.service.LoginService;

public class LoginServiceImpl implements LoginService
{
	private LoginDAO loginDAO;
	
	public LoginServiceImpl(LoginDAO loginDAO)
	{
		this.loginDAO=loginDAO;
	}
	
	//默认-1，为0为通过，为1位密码错误，为2为账号错误
	@Override
	public Integer verifyLogin(Login login)
	{
		Login l = loginDAO.findLogin(login);
		int result = -1;
		if(login.getId().equals(l.getId()))
		{
			if(login.getPassword().equals(l.getPassword()))
			{
				result = 0;
			}
			else
			{
				result = 1;
			}
		}
		else
		{
			result = 2;
		}
		return result;
	}

}
