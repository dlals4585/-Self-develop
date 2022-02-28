package com.self_develop.myproject.projectutil;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
//import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.self_develop.myproject.campsite.dao.CampsiteDAO;
import com.self_develop.myproject.campsite.vo.CampsiteVO;
import com.self_develop.myproject.campsite.vo.GoCampsiteVO;
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
	
	//일반인증키(Encoding)
	String apikey = "b8LpTmbk7xznTrtUY2pSw6W1w6bHAOsJfSy9rsAx%2BYYEVpaccD7g%2FTEqRyEcjuLyTxhN1Q1faM%2BBMs%2FY%2B9lXAg%3D%3D";
	//일반인증키(Decoding)
	String apiKey = "b8LpTmbk7xznTrtUY2pSw6W1w6bHAOsJfSy9rsAx+YYEVpaccD7g/TEqRyEcjuLyTxhN1Q1faM+BMs/Y+9lXAg==";
	private final String USER_AGENT = "Mozilla/5.0";
	
	@RequestMapping(value = "/api", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getData() {
		return "{\"result\":\"ok\"}";
	}
	
	public String sendGet(String targetUrl) throws Exception{
		URL url = new URL(targetUrl);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");	
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		String inputLine;
		StringBuffer response = new StringBuffer();
		
		while((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println("HTTP 응답 코드 : "+responseCode);
		System.out.println("HTTP body : "+response.toString()+"\n");
		return response.toString();
	}
	public String sendPost(String targetUrl, String parameters) throws Exception{
		URL url = new URL(targetUrl);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("POST");	
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setDoOutput(true); //POST 파라미터 전달을 위한 설정
		
		//Send post request
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(parameters);
		wr.flush();wr.close();
		
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		String inputLine;
		StringBuffer response = new StringBuffer();
		
		while((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println("HTTP 응답 코드 : "+responseCode);
		System.out.println("HTTP body : "+response.toString());
		return response.toString();
	}
	
	public String jsonParse(String data) {
		String response = "";
		JSONObject jObject = new JSONObject(data);
		JSONObject responseObject = jObject.getJSONObject("response");
		JSONObject headerObject = responseObject.getJSONObject("header");
		System.out.println("headerObject : "+headerObject.toString());
		
		JSONObject bodyObject = responseObject.getJSONObject("body");
		System.out.println("bodyObject : "+bodyObject.toString());
		
		/*
		 * JSONObject itemsObject = bodyObject.getJSONObject("items");
		 * System.out.println("itemsObject : "+itemsObject.toString()); response =
		 * itemsObject.toString();
		 */ 
		
		String getdata = bodyObject.get("items").toString();
		System.out.println("getdata : "+getdata);
		response = getdata;
		
		return response;
	}
	
	public JSONObject jsonParsedata(String data) {
		String response = "";
		JSONObject jObject = new JSONObject(data);
		JSONObject responseObject = jObject.getJSONObject("response");
		JSONObject headerObject = responseObject.getJSONObject("header");
		System.out.println("headerObject : "+headerObject.toString());
		
		JSONObject bodyObject = responseObject.getJSONObject("body");
		System.out.println("bodyObject : "+bodyObject.toString());
		
		JSONObject itemsObject = bodyObject.getJSONObject("items");
		System.out.println("itemsObject : "+itemsObject.get("item").toString());
		
		//JSONArray array = new JSONArray(itemsObject.get("item"));
		//System.out.println("getdata : "+array);
		//response = getdata;
		
		return itemsObject;
	}
	
	public String jsonParsebody(String data) {
		String response = "";
		JSONObject jObject = new JSONObject(data);
		JSONObject responseObject = jObject.getJSONObject("response");
		JSONObject headerObject = responseObject.getJSONObject("header");
		System.out.println("headerObject : "+headerObject.toString());
		
		JSONObject bodyObject = responseObject.getJSONObject("body");
		System.out.println("bodyObject : "+bodyObject.toString());
		String getdata = bodyObject.get("totalCount").toString();
		System.out.println("getdata : "+getdata);
		response = bodyObject.toString();
		
		return response;
	}
	
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
	
	///고캠핑 기본정보 목록을 조회하는 기능
	@RequestMapping(value = "/insertdefaultCamplist/{pageNo}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String insertdefaultCamplist(@PathVariable String pageNo) {
		String result = "";
		try { 
			String appName = URLEncoder.encode("렛츠캠핑", "UTF-8");
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/GoCamping/basedList";
			String urlparam = "ServiceKey="+apikey		//인증키 (서비스키)
					+ "&numOfRows=20"					//한 페이지 결과 수	총 2928건
					+ "&pageNo="+pageNo					//현재 페이지 번호
					+ "&numOfRows=2928"					//한 페이지 결과 수
					+ "&MobileOS=AND"					//OS 구분(IOS (아이폰), AND (안드로이드), WIN (윈도우폰), ETC))
					+ "&MobileApp="+appName				//서비스명=어플명
					+ "&_type=json";
			url += "?"+urlparam;
			JSONArray jsonArray1 = (JSONArray) jsonParsedata(sendGet(url)).get("item");
			for(int i = 0; i<jsonArray1.length();i++) {
				JSONObject c = jsonArray1.getJSONObject(i);
				GoCampsiteVO vo = new GoCampsiteVO(c);
				campsitedao.insertGoCampsite(vo);
			}
			result = jsonArray1.toString();
			//System.out.println("array1 = = "+jsonArray1.get(1));
			//campsitedao.insertGoCampsite(vo);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
		
	///고캠핑 기본정보 목록을 조회하는 기능
	@RequestMapping(value = "/getdefaultCamplist/{pageNo}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getdefaultCamplist(@PathVariable String pageNo) {
		String result = "";
		String numOfRows = "15";
		//pageNo = "1";
		
		try {
			String appName = URLEncoder.encode("렛츠캠핑", "UTF-8");
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/GoCamping/basedList";
			String urlparam = "ServiceKey="+apikey		//인증키 (서비스키)
					+ "&numOfRows="+numOfRows	//한 페이지 결과 수
					+ "&pageNo="+pageNo			//현재 페이지 번호
					+ "&MobileOS=AND"			//OS 구분(IOS (아이폰), AND (안드로이드), WIN (윈도우폰), ETC))
					+ "&MobileApp="+appName		//서비스명=어플명
					+ "&_type=json";
			
			//sendPost(url,urlparam);
			
			url += "?"+urlparam;
			result = jsonParse(sendGet(url));
			
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result.equals(null)) {result = "";}
		return result;
	}
	
	///내주변 좌표를 기반으로 고캠핑정보 목록을 조회하는 기능
	@RequestMapping(value = "/getlocationCamplist/{pageNo}/{mapX}/{mapY}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)		//@RequestBody Map<String,String> params ) { //params.get("numOfRows");//
	public String getlocationCamplist(@PathVariable String pageNo, @PathVariable String mapX, @PathVariable String mapY ) {
		String result = "";
		String numOfRows = "15"; 
		/*  pageNo = "1"; 
		 *	mapX = "128.5998171";
		 *  mapY = "35.2822939";
		 */		
		try {
			String appName = URLEncoder.encode("렛츠캠핑", "UTF-8");
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/GoCamping/locationBasedList";
			String urlparam = "ServiceKey="+apikey			//인증키 (서비스키)
					+ "&numOfRows="+numOfRows		//한 페이지 결과 수
					+ "&pageNo="+pageNo				//현재 페이지 번호
					+ "&MobileOS=AND"				//OS 구분(IOS (아이폰), AND (안드로이드), WIN (윈도우폰), ETC))
					+ "&MobileApp="+appName			//서비스명=어플명
					+ "&mapX="+mapX					//경도
					+ "&mapY="+mapY					//위도
					+ "&radius=20000"				//거리반경
					+ "&_type=json";
			
			//sendPost(url,urlparam);
			
			url += "?"+urlparam;
			result = jsonParse(sendGet(url));
			//result = sendGet(url);
			
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result.equals(null)) {result = "";}
		return result;
	}
	
	///키워드로 검색을 하여 고캠핑정보 목록을 조회하는 기능
		@RequestMapping(value = "/getSearchCamplist/{pageNo}/{keyword}", method = RequestMethod.GET)
		@ResponseStatus(value = HttpStatus.OK)
		public String getSearchCamplist(@PathVariable String pageNo, @PathVariable String keyword) {
			String result = "";
			String numOfRows = "15";
			//pageNo = "1"; 
			//keyword = "평창";
			
			try {
				String appName = URLEncoder.encode("렛츠캠핑", "UTF-8");
				keyword = URLEncoder.encode(keyword, "UTF-8");
				
				String url = "http://api.visitkorea.or.kr/openapi/service/rest/GoCamping/searchList";
				String urlparam = "ServiceKey="+apikey		//인증키 (서비스키)
						+ "&numOfRows="+numOfRows	//한 페이지 결과 수
						+ "&pageNo="+pageNo			//현재 페이지 번호
						+ "&MobileOS=AND"			//OS 구분(IOS (아이폰), AND (안드로이드), WIN (윈도우폰), ETC))
						+ "&MobileApp="+appName		//서비스명=어플명
						+ "&keyword="+keyword		//검색 요청할 키워드
						+ "&_type=json";
				
				//sendPost(url,urlparam);
				
				url += "?"+urlparam;
				result = jsonParse(sendGet(url));
				if(result.equals("")) {
					result = "{\"item\":\"false\"}";
				}
				
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(result.equals(null)) {result = "";}
			return result;
		}
		
		///키워드로 검색을 하여 고캠핑정보 목록을 조회하는 기능(HashMap)
		@ResponseBody
		@RequestMapping(value="/getSearchCamp", method = {RequestMethod.POST})
		//@PutMapping(value = "/getSearchCamp")
		public String getSearchCamp(@RequestBody HashMap<String,Object> map) {
			//Map<String, Object> urlparam = new HashMap<String,Object>();
			String result = "";
			String numOfRows = "15";
			//pageNo = "1"; 
			//keyword = "평창"; 
			String keyword = map.get("keyword").toString();
			try {
				String appName = URLEncoder.encode("렛츠캠핑", "UTF-8");
				keyword = URLEncoder.encode(keyword, "UTF-8");
				
				String url = "http://api.visitkorea.or.kr/openapi/service/rest/GoCamping/searchList";
				
				String urlparam = "ServiceKey="+apikey		//인증키 (서비스키)
						+ "&numOfRows="+numOfRows	//한 페이지 결과 수
						+ "&pageNo="+map.get("pageNo").toString()			//현재 페이지 번호
						+ "&MobileOS=AND"			//OS 구분(IOS (아이폰), AND (안드로이드), WIN (윈도우폰), ETC))
						+ "&MobileApp="+appName		//서비스명=어플명
						+ "&keyword="+keyword		//검색 요청할 키워드
						+ "&_type=json";
				
				//urlparam.put("ServiceKey",apikey);
				//result = jsonParsebody(sendPost(url,urlparam));
				
				//sendPost(url,urlparam);
				
				url += "?"+urlparam;
				result = jsonParsebody(sendGet(url));
				if(result.equals("")) {
					result = "{\"item\":\"false\"}";
				}
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(result.equals(null)) {result = "";}
			return result;
		}
	
	
		/// 고캠핑 컨텐츠에 해당하는 이미지URL 목록을 조회하는 기능
		//@RequestMapping(value = "/getimageCamplist/{contentId}", method = RequestMethod.GET)
		@ResponseBody
		@RequestMapping(value="/getimageCamplist", method = {RequestMethod.POST})
		@ResponseStatus(value = HttpStatus.OK)
		//public String getimageCamplist(@PathVariable String contentId) {
		public String getimageCamplist(@RequestBody HashMap<String,Object> map) {
			String result = "";
			String contentId = map.get("contentId").toString();//"3429";
			
			try {
				String appName = URLEncoder.encode("렛츠캠핑", "UTF-8");
				String url = "http://api.visitkorea.or.kr/openapi/service/rest/GoCamping/imageList";
				String urlparam = "ServiceKey="+apikey		//인증키 (서비스키)
						+ "&MobileOS=AND"			//OS 구분(IOS (아이폰), AND (안드로이드), WIN (윈도우폰), ETC))
						+ "&MobileApp="+appName		//서비스명=어플명
						+ "&contentId="+contentId	//콘텐츠ID
						+ "&_type=json";
				
				//sendPost(url,urlparam);
				
				url += "?"+urlparam;
				result = jsonParsebody(sendGet(url));//jsonParse(sendGet(url));
				//result = sendGet(url);
				if(result.equals("")) {
					result = "{\"item\":\"false\"}";
				}
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//if(result.equals(null)) {result = "";}
			return result;
		}
	
}