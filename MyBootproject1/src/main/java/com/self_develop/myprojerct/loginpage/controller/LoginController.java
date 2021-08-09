package com.self_develop.myprojerct.loginpage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//

import com.self_develop.myprojerct.loginpage.dao.LoginDAO;
import com.self_develop.myprojerct.loginpage.vo.LoginVO;

public class LoginController {
		
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired 
	private LoginDAO logindao;
	 	
	/*
	 * @RequestMapping("/home.do") public @ResponseBody List<LoginVO>
	 * selectListLoginMember(
	 * 
	 * @ModelAttribute("loginVO") LoginVO loginvo, ModelMap model) throws Exception
	 * { List<LoginVO> eList = loginservice.selectListLoginMember(loginvo); return
	 * eList; }
	 */
	
	@RequestMapping(value = "/login")
	public String login(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("Logincontroller == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return "/login/login";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("Logincontroller == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return "/login/logout";
	}
	
	@RequestMapping(value = "/login_add")
	public String login_add(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("Logincontroller == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return "/login/login_add";
	}
	
	@RequestMapping(value = "/login_delete")
	public String login_delete(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("Logincontroller == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return "/login/login_add";
	}
}
