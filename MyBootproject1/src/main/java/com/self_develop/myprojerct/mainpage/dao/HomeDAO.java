package com.self_develop.myprojerct.mainpage.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
//import org.mybatis.spring.SqlSessionTemplate;

import com.self_develop.myprojerct.mainpage.vo.*;

@Mapper
public interface HomeDAO {
	
	public List<HomeVO> selectAddress();
	
//	@Autowired
//	SqlSessionTemplate temp;
//	
//	public List<HomeVO> selectAddress() {
//		List<HomeVO> list = temp.selectList("com.self_develop.myprojerct.mainpage.dao.HomeDAO.selectAddress");
//		return list;
//	}
	
}
