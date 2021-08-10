package com.self_develop.myproject.mainpage.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.self_develop.myproject.mainpage.vo.*;

@Mapper
public interface HomeDAO {
	List<HomeVO> selectAddress();
}
