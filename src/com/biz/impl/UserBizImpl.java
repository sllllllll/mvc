package com.biz.impl;

import com.biz.IUserBiz;
import com.dao.IUserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
/**
 * 专门用于处理用户的业务逻辑层实现类
 * @author dhc
 * @version V1.0
 */
public class UserBizImpl implements IUserBiz {
	private IUserDao udao = new UserDaoImpl();
	@Override
	public boolean login(User ui) {
		boolean bl = false;
		try {
			bl = udao.findUserByNamePwd(ui);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return bl;
	}

}
