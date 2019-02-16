package cn.hz.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hz.bean.User;

public class TestBeanIoc {
	
	@Test
	public void testBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
		user.eat();
	}
}	
