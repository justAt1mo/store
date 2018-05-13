package cn.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.bean.Login;
import cn.dao.DAOSupport;
import cn.dao.LoginDAO;

public class LoginDAOImpl extends DAOSupport implements LoginDAO
{
	public LoginDAOImpl(HibernateTemplate template)
	{
		super(template);
	}

	@Override
	public Login findLogin(Login login)
	{
		int id = login.getId();
		// TODO Auto-generated method stub
		List<Login> result = template.find("from Login l where l.id = ?", id);
		if(result.size()!=0)
		{
			return result.get(0);
		}
		else
		{
			return null;
		}
	}

}
