package cn.demo;

import javax.annotation.Resource;

import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bean.Login;

@Service("testService")  
public class TestService {  
    @Resource  
    private SessionFactory sessionFactory;  
    @Transactional  
    public void saveTwoUser(){  
        Session currentSession = sessionFactory.getCurrentSession();  
        currentSession.save(new Login());  
    //    int i = 1 / 0;//这里会抛出异常  
        currentSession.save(new Login());  
    }  
}  
