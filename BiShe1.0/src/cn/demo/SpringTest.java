package cn.demo;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
    
    //测试SessionFactory  
    @Test  
    public void testSessionFactory(){  
        SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");  
        System.out.println(sessionFactory);
        System.exit(0);
    }
    
    //测试事务  
    @Test  
    public void testTransaction(){  
        TestService testService = (TestService) ac.getBean("testService");  
        testService.saveTwoUser();  
    }  
}
