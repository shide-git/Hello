package com.my.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.entity.User;
import com.my.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	public UserService userService;
	
	@RequestMapping("/findUsers")
	public String findUsers(Model model){
		List<User> list = userService.findUsers();
		model.addAttribute("users", list);
		return "success";
	}
	
	@RequestMapping("/addUser")
	public void addUser(){
		User user = new User();
		user.setId(1);
		user.setUname("TTTT");
		user.setPwd("ttttt");
		int result = userService.addUser(user);
		System.out.println(result);
	}
	
	@RequestMapping("/home")
	public String index(){
		System.out.println("hello");
		return "index";
	}
}
