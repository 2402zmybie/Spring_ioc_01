package cn.hz.service;

import cn.hz.dao.UserDao;

public class UserService {
	//service中依赖userdao
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void query() {
		userDao.query();
	}

	
}
