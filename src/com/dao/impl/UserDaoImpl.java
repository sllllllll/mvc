package com.dao.impl;

import com.dao.IUserDao;
import com.entity.User;
import com.util.JdbcUtils;
/**
 * 专门用于处理用户的数据访问层实现类
 * @author dhc
 * @version V1.0
 */
public class UserDaoImpl implements IUserDao {

	@Override
	public boolean findUserByNamePwd(User ui) {
		boolean bl=false;
		try {
			int i = JdbcUtils.querySingle("select count(*) from userInfo where userName=? and userPwd=? ", new Object[]{ui.getUserName(),ui.getUserPwd()});
			if(i>0){
				bl = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return bl;
	}

}
