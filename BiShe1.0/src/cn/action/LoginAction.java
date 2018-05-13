package cn.action;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ModelDriven;

import cn.bean.Login;
import cn.service.LoginService;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction implements ModelDriven<Login>
{
	private Login login = new Login();
	@Override
	public Login getModel()
	{
		// TODO Auto-generated method stub
		return login;
	}
	
	@Override
	public String execute() throws Exception
	{
		try
		{
			System.out.println(login.getId());
			LoginService loginService = serviceManager.getLoginService();
			int r = loginService.verifyLogin(login);
			if(r==0)
			{
				//保存24小时
				saveCookie("login", String.valueOf(login.getId()), 24*60*60);
				HttpSession session = request.getSession();
				session.setAttribute("login", login.getId());
				session.setMaxInactiveInterval(60*60*3);
				return "user";
			}
			if(r==-1)
			{
				//保存24小时
				saveCookie("login", String.valueOf(login.getId()), 24*60*60);
				HttpSession session = request.getSession();
				session.setAttribute("login", login.getId());
				session.setMaxInactiveInterval(60*60*3);
				return "ms";
			}
		}
		catch (Exception e)
		{
			
		}
		return ERROR;
	}
}
