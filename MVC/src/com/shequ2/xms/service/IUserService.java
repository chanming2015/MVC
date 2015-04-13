/*
 *www.shequ2.com
 *Copyright (c) 2015 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.shequ2.xms.service;

import com.shequ2.xms.entity.User;

/**
 * Project:SpringMVC
 * Package:service
 * FileName:IUserService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-4-8 下午11:03:27
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public interface IUserService {
	
	User getUser(String name, String pass);
}
