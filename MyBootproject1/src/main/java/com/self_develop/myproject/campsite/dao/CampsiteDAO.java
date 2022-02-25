package com.self_develop.myproject.campsite.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.self_develop.myproject.campsite.vo.CampsiteVO;
import com.self_develop.myproject.campsite.vo.GoCampImageVO;
import com.self_develop.myproject.campsite.vo.GoCampsiteVO;

@Mapper
public interface CampsiteDAO {
	public List<CampsiteVO> selectCampsite();
	//public void updateLoginMember(LoginVO vo);
	//public Map<String, Object> method() throw Exception;
	//public List<LoginVO> method() throw Exception;
	//public String method() throw Exception;
	//public int method() throw Exception;
	//throw Exception 이 있을 경우에는 controller의 메소드에도 throw exception을 정의해 주어야 함
	
	public List<GoCampsiteVO> insertGoCampsite(GoCampsiteVO vo);
	public List<GoCampsiteVO> selectGoCampsite();
	public List<GoCampImageVO> selectGoCampimage();
}
