package com.self_develop.myprojerct.mainpage.dao;

import java.util.List;
import org.apache.ibatis.annotations.*;
import com.self_develop.myprojerct.mainpage.vo.*;

@Mapper
public interface LoginDAO {
	public List<LoginVO> selectListLoginMember(LoginVO vo); 
}
