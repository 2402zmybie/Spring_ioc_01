package cn.hz.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hz.bean.User;
import cn.hz.service.UserService;

public class TestUserService {
	
	@Test
	public void testBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		UserService userService =  (UserService) context.getBean("userservice");
		userService.query();
	}
}	
