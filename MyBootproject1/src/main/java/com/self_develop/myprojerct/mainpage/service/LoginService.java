package com.self_develop.myprojerct.mainpage.service;

import java.util.List;
import com.self_develop.myprojerct.mainpage.vo.LoginVO;

public interface LoginService {
	List<LoginVO> selectListLoginMember(LoginVO vo); 
}
