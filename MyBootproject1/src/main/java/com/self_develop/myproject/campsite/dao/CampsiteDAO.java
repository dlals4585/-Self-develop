package com.self_develop.myproject.campsite.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.self_develop.myproject.campsite.vo.CampsiteVO;

@Mapper
public interface CampsiteDAO {
	public List<CampsiteVO> selectCampsite();
	//public void updateLoginMember(LoginVO vo);
	//public Map<String, Object> method() throw Exception;
	//public List<LoginVO> method() throw Exception;
	//public String method() throw Exception;
	//public int method() throw Exception;
	//throw Exception �씠 �엳�쓣 寃쎌슦�뿉�뒗 controller�쓽 硫붿냼�뱶�뿉�룄 throw exception�쓣 �젙�쓽�빐 二쇱뼱�빞 �븿
}
