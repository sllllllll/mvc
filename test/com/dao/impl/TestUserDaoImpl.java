package com.dao.impl;

import org.junit.Test;

import com.dao.IUserDao;
import com.entity.User;

public class TestUserDaoImpl {
	@Test
	public void testQuery(){
		User ui = new User("zwj@qq.com","123");
		IUserDao udao = new UserDaoImpl();
		boolean bl = udao.findUserByNamePwd(ui);
		System.out.println(bl);
	}
}
