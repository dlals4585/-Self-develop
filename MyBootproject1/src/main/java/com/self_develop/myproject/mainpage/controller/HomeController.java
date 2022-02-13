package com.self_develop.myproject.mainpage.controller;

import java.text.DateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.self_develop.myproject.mainpage.service.HomeService;
import com.self_develop.myproject.mainpage.vo.HomeVO;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private HomeService homedao;
	
	@RequestMapping(value = "/side_page")//, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, headers = {"Accept=application/json"})
	public String side_page() {
		return "/home/side_page";
	}
	
	@RequestMapping(value = "/home")//, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, headers = {"Accept=application/json"})
	@ResponseBody
	public ModelAndView home(Locale locale, Model model, ModelMap modelmap) {
		logger.info("Welcome home! The client locale is {}.", locale);
		ModelAndView mov = new ModelAndView();
		//Map<String, Object> data = new HashMap<String,Object>();
		List<HomeVO> address = homedao.selectAddress();
		
//		for(HomeVO i : address) { 
//			System.out.println(i.getArea_Name());
//			System.out.println(i.getArea_Cd());
//		}
		
		//data.put("area_data",address);
		modelmap.put("response",address);
//		ModelAndView mov = new ModelAndView("jsonView",modelmap); 
		mov.setViewName("/home/home"); 
		mov.addObject("list",address);
		
//		for(int i = 0; i<address.size();i++) {
//			System.out.println("주소 == "+address.get(i).getArea_Name()); 
//		}
//		mov.addObject("adr_nm",address.get(0).getArea_Name());
//		mov.addObject("adr_cd",address.get(1).getArea_Cd());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("home == "+formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return mov; 
	}
	
	@RequestMapping(value = "/footer")//, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, headers = {"Accept=application/json"})
	public String common_footer() {
		return "/home/footer";
	}
	
}