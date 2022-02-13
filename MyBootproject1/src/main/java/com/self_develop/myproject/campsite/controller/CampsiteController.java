package com.self_develop.myproject.campsite.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.self_develop.myproject.campsite.dao.CampsiteDAO;
import com.self_develop.myproject.campsite.vo.CampsiteVO;


@Controller
public class CampsiteController {
	
	private static final Logger logger = LoggerFactory.getLogger(CampsiteController.class);
	
	@Autowired 
	private CampsiteDAO campsitedao;
	
	@RequestMapping(value = "/camplist")
	public ModelAndView camplist(HttpServletRequest request, Locale locale, Model model) { 
		List<CampsiteVO> campsite = campsitedao.selectCampsite();
		ModelAndView mov = new ModelAndView(); 
		mov.setViewName("/campsite/camplist"); 
		mov.addObject("list",campsite);
		
		Date date = new Date(); 
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("camplist == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return mov;
	}

}
