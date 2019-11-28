package com.web.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.pojo.Admin;
import com.web.service.User_AdminService;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	@Autowired
	private User_AdminService user_AdminService;
	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String login(String username,String password, Model model,  HttpSession session) {
		// 通过账号和密码查询用户
		Admin admin = user_AdminService.find_login_N_P(username, password);
		if(admin != null){	
			session.setAttribute("USER_SESSION", admin);
		System.out.println(admin);
		
		}else{
			
		model.addAttribute("msg", "UserName or Password wrong please try again！");
		return "Login";
		}
		return "Dashboard";
	}
	/**
	 * 退出登录
	 */
	@RequestMapping(value = "/logout.action")
	public String logout(HttpSession session) {
	    // 清除Session
	    session.invalidate();
	    // 重定向到登录页面的跳转方法
	    return "redirect:login.action";
	}
}
