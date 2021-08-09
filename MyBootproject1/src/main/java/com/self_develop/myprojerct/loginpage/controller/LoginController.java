package com.self_develop.myprojerct.loginpage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//
import org.springframework.web.servlet.ModelAndView;

import com.self_develop.myprojerct.loginpage.dao.LoginDAO;
import com.self_develop.myprojerct.loginpage.vo.LoginVO;

@Controller
public class LoginController {
		
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired 
	private LoginDAO logindao;
	
	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request, Locale locale, Model model) { 
		
		ModelAndView mov = new ModelAndView(); 
		mov.setViewName("/login/login"); 
	 
		Date date = new Date(); 
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
 
		String formattedDate = dateFormat.format(date);
		System.out.println("Logincontroller == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return mov;
	}
	
	@RequestMapping(value = "/login_update")
	public ModelAndView login_update(HttpServletRequest request, HttpServletResponse res, Locale locale, Model model) {
		ModelAndView mov = new ModelAndView(); 
		String no = request.getParameter("no");
		String pwd = request.getParameter("pw");
		System.out.println("no == "+no);
		System.out.println("pwd == "+pwd);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("login_update == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		mov.setViewName("redirect:/login");
		return mov;
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
