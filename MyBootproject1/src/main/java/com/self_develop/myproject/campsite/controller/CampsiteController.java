package com.self_develop.myproject.campsite.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CampsiteController{
		
	private static final Logger logger = LoggerFactory.getLogger(CampsiteController.class);
	
	@RequestMapping(value = "/camplist")
	public ModelAndView camplist(HttpServletRequest request, Locale locale, Model model) { 
		
		ModelAndView mov = new ModelAndView(); 
		mov.setViewName("/campsite/camplist"); 
	 
		Date date = new Date(); 
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("camplist == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return mov;
	}
	
}
