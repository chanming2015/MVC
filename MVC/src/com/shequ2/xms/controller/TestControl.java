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
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
//使用注解定义控制器
@Controller
//定义类拦截
@RequestMapping("/test")
public class TestControl {
	
	@Autowired
	private IUserService userService;

	//定义方法拦截
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
	
	//使用URL传参
	@RequestMapping(value="/index/{name}", method=RequestMethod.GET)
	public String index(@PathVariable String name,@MatrixVariable(required=false, defaultValue="123") int pass, Model model){
		model.addAttribute("name", name);
		model.addAttribute("pass", pass);
		return "index";
	}
	
	@RequestMapping(value="/index2/{name}/{pass}", method=RequestMethod.GET, produces="application/json")
	@ResponseBody
	public User index2(@PathVariable String name, @PathVariable String pass, Model model){
		User user = userService.getUser(name, pass);
		System.out.println(user.getUsername());
		return user;
	}

}
