package com.self_develop.myprojerct.mainpage.controller;

import java.text.DateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.self_develop.myprojerct.mainpage.dao.HomeDAO;
import com.self_develop.myprojerct.mainpage.service.HomeService;
import com.self_develop.myprojerct.mainpage.vo.HomeVO;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private HomeService homedao;
	
	@RequestMapping("/side_page")
	public String side_page() {
		return "/home/side_page";
	}
	
	@RequestMapping(value = "/home")
	public ModelAndView home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		ModelAndView mov = new ModelAndView(); 
		mov.setViewName("/home/home"); 
		
		List<HomeVO> address = homedao.selectAddress();
		
		for(HomeVO i : address) { 
			System.out.println(i.getArea_Name()); 
		}
		
		mov.addObject("list",address);
		
		for(int i = 0; i<address.size();i++) {
			System.out.println("주소 == "+address.get(i).getArea_Name()); 
		}
		
//		mov.addObject("adr_nm",address.get(0).getArea_Name());
//		mov.addObject("adr_cd",address.get(1).getArea_Cd());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("접속시간 == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return mov; 
	}
	
	@RequestMapping("/footer")
	public String common_footer() {
		return "/home/footer";
	}
	
}