package com.self_develop.myprojerct.mainpage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.self_develop.myprojerct.mainpage.dao.LoginDAO;
import com.self_develop.myprojerct.mainpage.service.LoginService;
import com.self_develop.myprojerct.mainpage.vo.LoginVO;

public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDAO logindao;
	
	@Override
	public List<LoginVO> selectListLoginMember(LoginVO vo) {
		// TODO Auto-generated method stub
		return logindao.selectListLoginMember(vo);
	}
	

}
