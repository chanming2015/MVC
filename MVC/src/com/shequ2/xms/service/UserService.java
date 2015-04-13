/*
 *www.shequ2.com
 *Copyright (c) 2015 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.shequ2.xms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shequ2.xms.dao.IUserDAO;
import com.shequ2.xms.entity.User;


/**
 * Project:SpringMVC
 * Package:service
 * FileName:UserService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-4-8 下午11:03:51
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@Service("userService")
public class UserService implements IUserService{
	
	@Autowired
	private IUserDAO userDAO;

	@Override
	public User getUser(String name, String pass) {
		return userDAO.selectUserByNameAndPass(name, pass);
	}

}
