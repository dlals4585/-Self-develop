package com.self_develop.myprojerct.loginpage.dao;

import java.util.List;
import org.apache.ibatis.annotations.*;
import com.self_develop.myprojerct.loginpage.vo.*;

@Mapper
public interface LoginDAO {
	public LoginVO selectLoginMember();
	public void updateLoginMember(LoginVO vo);
	//public Map<String, Object> method() throw Exception;
	//public List<LoginVO> method() throw Exception;
	//public String method() throw Exception;
	//public int method() throw Exception;
	//throw Exception 이 있을 경우에는 controller의 메소드에도 throw exception을 정의해 주어야 함
}
