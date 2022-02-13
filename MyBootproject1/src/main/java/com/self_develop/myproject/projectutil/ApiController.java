package com.self_develop.myproject.projectutil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.self_develop.myproject.campsite.dao.CampsiteDAO;
import com.self_develop.myproject.campsite.vo.CampsiteVO;
import com.self_develop.myproject.loginpage.dao.LoginDAO;
import com.self_develop.myproject.loginpage.vo.LoginVO;
import com.self_develop.myproject.mainpage.service.HomeService;
import com.self_develop.myproject.mainpage.vo.HomeVO;

@RestController
public class ApiController {
	
	@Autowired
	HomeService homedao;
	@Autowired 
	private LoginDAO logindao;
	@Autowired 
	private CampsiteDAO campsitedao;
	
	@RequestMapping(value = "/api", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getData() {
		return "{\"result\":\"ok\"}";
	}//test
	
	public String returnJson(Map<String, Object> data) {
		String result = "";
		try {
			String json;
		//	json = new ObjectMapper().writeValueAsString(address);
			json = new ObjectMapper().writeValueAsString(data);
			result = json;
			System.out.println("result : " + result);
		}catch(JsonProcessingException e) {
			result = "{\"result\":\"false\"}";
			System.out.println("result_error : " + e);
			System.out.println("result : " + result);
		}
		return result;
	}
	
	@RequestMapping(value = "/area", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getArea() {
		Map<String, Object> data = new HashMap<String,Object>();
		List<HomeVO> address = homedao.selectAddress();
		data.put("data",address);
		return returnJson(data);
	}
	
	@RequestMapping(value = "/camplist", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getcamplist() {
		Map<String, Object> data = new HashMap<String,Object>();
		List<CampsiteVO> campsite = campsitedao.selectCampsite();
		data.put("data",campsite);
		return returnJson(data);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getlogin() {
		//Map<String, Object> data = new HashMap<String,Object>();
		LoginVO logininfo = logindao.selectLoginMember();
		//data.put("area_data",address);
		String result = "";
		try {
			String json;
			json = new ObjectMapper().writeValueAsString(logininfo);
			result = json;
			System.out.println("result : " + result);
		}catch(JsonProcessingException e) {
			result = "{\"result\":\"false\"}";
			System.out.println("result_error : " + e);
			System.out.println("result : " + result);
		}
		return result;
	}
	
}