/*
 *www.shequ2.com
 *Copyright (c) 2015 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.shequ2.xms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shequ2.xms.entity.User;
import com.shequ2.xms.service.IUserService;

/**
 * Project:Maven-SpringMVC
 * Package:com.shequ2.xms.control
 * FileName:TestControl.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-4-4 下午10:47:21
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@Controller
@RequestMapping("/test")
public class TestControl {
	
	@Autowired
	private IUserService userService;

	@RequestMapping(value="/toLogin", method=RequestMethod.GET)
	public String toLogin(Model model){
		return "toLogin";
	}
	
	@RequestMapping(value="/doLogin/{name}/{pass}", method=RequestMethod.POST)
	public String doLogin(@PathVariable String name, @PathVariable String pass, Model model){
		User user = userService.getUser(name, pass);
		if(user!=null){
			model.addAttribute("message", user);
		}else {
			model.addAttribute("message", "该用户不存在！");
		}
		return "doLogin";
	}

}
