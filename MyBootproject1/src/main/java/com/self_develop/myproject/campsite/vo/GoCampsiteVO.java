package com.self_develop.myproject.campsite.vo;

import org.json.JSONObject;

public class GoCampsiteVO {
	int contentId = 0;				//콘텐츠 ID
	String facltNm = "";			//야영장 명	
	String lineIntro = "";			//한줄소개
	String intro = "";				//소개
	String allar = "";				//전체면적
	String insrncAt = "";			//영업배상책임보험 가입여부(Y:사용, N:미사용)
	String trsagntNo = "";			//관광사업자 번호
	String bizrno = "";				//사업자번호
	String facltDivNm = "";			//사업주체.구분
	String mangeDivNm = "";			//운영주체.관리주체(직영, 위탁)
	String mgcDiv = "";				//운영기관.관리기관
	String manageSttus = "";		//운영상태.관리상태
	String hvofBgnde = "";			//호장기간.휴무기간 시작일
	String hvofEnddle = "";			//휴장기간.휴무기간 종료일
	String featureNm = "";			//특징
	String induty = "";				//업종
	String lctCl = "";				//입지구분
	String doNm = "";				//도
	String sigunguNm = "";			//시군구
	String zipcode = "";			//우편번호
	String addr1 = "";				//주소
	String addr2 = "";				//주소상세
	
	String mapX = "";				//경도
	String mapY = "";				//위도
	String direction = "";			//오시는 길 컨텐츠
	String tel = "";				//전화
	String homepage = "";			//홈페이지
	String resveUrl = "";			//예약 페이지
	String resveCl = "";			//예약구분
	String manageNmpr = "";			//상주관리인원
	String gnrlSiteCo = "";			//주요시설 일반 야영장
	String autoSiteCo = "";			//주요시설 자동차야영장
	String glampSiteCo = "";		//주요시설 글램핑
	String caramSiteCo = "";		//주요시설 카라반
	String indvdlCaravSiteCo = "";	//주요시설 개인 카라반
	String sitedStnc = "";			//사이트간 거리
	String siteMg1Width = "";		//사이트 크기1 가로
	String siteMg2Width = "";		//사이트 크기2 가로
	String siteMg3Width = "";		//사이트 크기3 가로
	String siteMg1Vrticl = "";		//사이트 크기1 세로
	String siteMg2Vrticl = "";		//사이트 크기2 세로
	String siteMg3Vrticl = "";		//사이트 크기3 세로
	String siteMg1Co = "";			//사이트 크기1 수량
	String siteMg2Co = "";			//사이트 크기2 수량
	String siteMg3Co = "";			//사이트 크기3 수량
	
	String siteBottomCl1 = "";		//잔디
	String siteBottomCl2 = "";		//파쇄석
	String siteBottomCl3 = "";		//테크
	String siteBottomCl4 = "";		//자갈
	String siteBottomCl5 = "";		//맨흙
	String tooltip = "";			//툴팁
	String glampInnerFclty = "";	//글램핑-내부시설
	String caravInnerFclty = "";	//카라반-내부시설
	String prmisnDe = "";			//인허가일자
	String operPdCl = "";			//운영기간
	String operDeCl = "";			//운영일
	String trlerAcmpnyAt = "";		//개인 트레일러 동반 여부(Y:사용, N:미사용)
	String caravAcmpnyAt = "";		//개인 카라반 동반 여부(Y:사용, N:미사용)
	String toiletCo = "";			//화장실 개수
	String swrmCo = "";				//샤워실 개수
	String wtrplCo = "";			//개수대 개수
	String brazierCl = "";			//화로대
	String sbrsCl = "";				//부대시설
	String sbrsEtc = "";			//부대시설 기타
	String posblFcltyCl = "";		//주변 이용 가능시설
	String posblFcltyEtc = "";		//주변 이용 가능시설 기타
	String clturEventAt = "";		//자체 문화행사 여부(Y:사용, N:미사용)
	String clturEvent = "";			//자체 문화행사 명
	
	String exprnProgrmAt = "";		//체험 프로그램 여부(Y:사용, N:미사용)
	String exprnProgrm = "";		//체험 프로그램 명
	String extshrCo = "";			//소화기 개수
	String frprvtWrppCo = "";		//방화수 개수
	String frprvtSandCo = "";		//방화사 개수
	String fireSensorCo = "";		//화재감지기 개수
	String themaEnvrnCl = "";		//테마환경
	String eqpmnLendCl = "";		//캠핑 장비 대여
	String animalCmgCl = "";		//애완동물 출입
	String tourEraCl = "";			//여행시기
	String firstImageUrl = "";		//대표이미지
	String createdtime = "";		//등록일
	String modifiedtime = "";		//수정일
	
	
	public GoCampsiteVO(JSONObject c) {
		if(!c.isNull("contentId")) this.setContentId(c.getInt("contentId"));
		if(!c.isNull("facltNm")) this.setFacltNm(c.getString("facltNm"));
		if(!c.isNull("lineIntro")) this.setLineIntro(c.getString("lineIntro"));
		if(!c.isNull("intro")) this.setIntro(c.getString("intro"));
		if(!c.isNull("allar")) this.setAllar(String.valueOf(c.getInt("allar")));
		if(!c.isNull("insrncAt")) this.setInsrncAt(c.getString("insrncAt"));
		if(!c.isNull("trsagntNo")) this.setTrsagntNo(String.valueOf(c.get("trsagntNo")));
		if(!c.isNull("bizrno")) this.setBizrno(c.getString("bizrno"));
		if(!c.isNull("facltDivNm")) this.setFacltDivNm(c.getString("facltDivNm"));
		if(!c.isNull("mangeDivNm")) this.setMangeDivNm(c.getString("mangeDivNm"));
		if(!c.isNull("mgcDiv")) this.setMgcDiv(c.getString("mgcDiv"));
		if(!c.isNull("manageSttus")) this.setManageSttus(c.getString("manageSttus"));
		if(!c.isNull("hvofBgnde")) this.setHvofBgnde(c.getString("hvofBgnde"));
		if(!c.isNull("hvofEnddle")) this.setHvofEnddle(c.getString("hvofEnddle"));
		if(!c.isNull("featureNm")) this.setFeatureNm(c.getString("featureNm"));
		if(!c.isNull("induty")) this.setInduty(c.getString("induty"));
		if(!c.isNull("lctCl")) this.setLctCl(c.getString("lctCl"));
		if(!c.isNull("doNm")) this.setDoNm(c.getString("doNm"));
		if(!c.isNull("sigunguNm")) this.setSigunguNm(c.getString("sigunguNm"));
		if(!c.isNull("zipcode")) this.setZipcode(String.valueOf(c.get("zipcode")));
		if(!c.isNull("addr1")) this.setAddr1(c.getString("addr1"));
		if(!c.isNull("addr2")) this.setAddr2(String.valueOf(c.get("addr2")));
		if(!c.isNull("mapX")) this.setMapX(String.valueOf(c.getLong("mapX")));
		if(!c.isNull("mapY")) this.setMapY(String.valueOf(c.getLong("mapY")));
		if(!c.isNull("direction")) this.setDirection(c.getString("direction"));
		if(!c.isNull("tel")) this.setTel(c.getString("tel"));
		if(!c.isNull("homepage")) this.setHomepage(c.getString("homepage"));
		if(!c.isNull("resveUrl")) this.setResveUrl(c.getString("resveUrl"));
		if(!c.isNull("resveCl")) this.setResveCl(c.getString("resveCl"));
		if(!c.isNull("manageNmpr")) this.setManageNmpr(String.valueOf(c.getInt("manageNmpr")));
		if(!c.isNull("gnrlSiteCo")) this.setGnrlSiteCo(String.valueOf(c.getInt("gnrlSiteCo")));
		if(!c.isNull("autoSiteCo")) this.setAutoSiteCo(String.valueOf(c.getInt("autoSiteCo")));
		if(!c.isNull("glampSiteCo")) this.setGlampSiteCo(String.valueOf(c.getInt("glampSiteCo")));
		if(!c.isNull("caramSiteCo")) this.setCaramSiteCo(String.valueOf(c.getInt("caramSiteCo")));
		if(!c.isNull("indvdlCaravSiteCo")) this.setIndvdlCaravSiteCo(String.valueOf(c.getInt("indvdlCaravSiteCo")));
		if(!c.isNull("sitedStnc")) this.setSitedStnc(String.valueOf(c.getInt("sitedStnc")));
		if(!c.isNull("siteMg1Width")) this.setSiteMg1Width(String.valueOf(c.getInt("siteMg1Width")));
		if(!c.isNull("siteMg2Width")) this.setSiteMg2Width(String.valueOf(c.getInt("siteMg2Width")));
		if(!c.isNull("siteMg3Width")) this.setSiteMg3Width(String.valueOf(c.getInt("siteMg3Width")));
		if(!c.isNull("siteMg1Vrticl")) this.setSiteMg1Vrticl(String.valueOf(c.getInt("siteMg1Vrticl")));
		if(!c.isNull("siteMg2Vrticl")) this.setSiteMg2Vrticl(String.valueOf(c.getInt("siteMg2Vrticl")));
		if(!c.isNull("siteMg3Vrticl")) this.setSiteMg3Vrticl(String.valueOf(c.getInt("siteMg3Vrticl")));
		if(!c.isNull("siteMg1Co")) this.setSiteMg1Co(String.valueOf(c.getInt("siteMg1Co")));
		if(!c.isNull("siteMg2Co")) this.setSiteMg2Co(String.valueOf(c.getInt("siteMg2Co")));
		if(!c.isNull("siteMg3Co")) this.setSiteMg3Co(String.valueOf(c.getInt("siteMg3Co")));
		if(!c.isNull("siteBottomCl1")) this.setSiteBottomCl1(String.valueOf(c.getInt("siteBottomCl1")));
		if(!c.isNull("siteBottomCl2")) this.setSiteBottomCl2(String.valueOf(c.getInt("siteBottomCl2")));
		if(!c.isNull("siteBottomCl3")) this.setSiteBottomCl3(String.valueOf(c.getInt("siteBottomCl3")));
		if(!c.isNull("siteBottomCl4")) this.setSiteBottomCl4(String.valueOf(c.getInt("siteBottomCl4")));
		if(!c.isNull("siteBottomCl5")) this.setSiteBottomCl5(String.valueOf(c.getInt("siteBottomCl5")));
		if(!c.isNull("tooltip")) this.setTooltip(c.getString("tooltip"));
		if(!c.isNull("glampInnerFclty")) this.setGlampInnerFclty(c.getString("glampInnerFclty"));
		if(!c.isNull("caravInnerFclty")) this.setCaravInnerFclty(c.getString("caravInnerFclty"));
		if(!c.isNull("prmisnDe")) this.setPrmisnDe(c.getString("prmisnDe"));
		if(!c.isNull("operPdCl")) this.setOperPdCl(c.getString("operPdCl"));
		if(!c.isNull("operDeCl")) this.setOperDeCl(c.getString("operDeCl"));
		if(!c.isNull("trlerAcmpnyAt")) this.setTrlerAcmpnyAt(c.getString("trlerAcmpnyAt"));
		if(!c.isNull("caravAcmpnyAt")) this.setCaravAcmpnyAt(c.getString("caravAcmpnyAt"));
		if(!c.isNull("toiletCo")) this.setToiletCo(String.valueOf(c.getInt("toiletCo")));
		if(!c.isNull("swrmCo")) this.setSwrmCo(String.valueOf(c.getInt("swrmCo")));
		if(!c.isNull("wtrplCo")) this.setWtrplCo(String.valueOf(c.getInt("wtrplCo")));
		if(!c.isNull("brazierCl")) this.setBrazierCl(c.getString("brazierCl"));
		if(!c.isNull("sbrsCl")) this.setSbrsCl(c.getString("sbrsCl"));
		if(!c.isNull("sbrsEtc")) this.setSbrsEtc(c.getString("sbrsEtc"));
		if(!c.isNull("posblFcltyCl")) this.setPosblFcltyCl(c.getString("posblFcltyCl"));
		if(!c.isNull("posblFcltyEtc")) this.setPosblFcltyEtc(c.getString("posblFcltyEtc"));
		if(!c.isNull("clturEventAt")) this.setClturEventAt(c.getString("clturEventAt"));
		if(!c.isNull("clturEvent")) this.setClturEvent(c.getString("clturEvent"));
		if(!c.isNull("exprnProgrmAt")) this.setExprnProgrmAt(c.getString("exprnProgrmAt"));
		if(!c.isNull("exprnProgrm")) this.setExprnProgrm(c.getString("exprnProgrm"));
		if(!c.isNull("extshrCo")) this.setExtshrCo(String.valueOf(c.getInt("extshrCo")));
		if(!c.isNull("frprvtWrppCo")) this.setFrprvtWrppCo(String.valueOf(c.getInt("frprvtWrppCo")));
		if(!c.isNull("frprvtSandCo")) this.setFrprvtSandCo(String.valueOf(c.getInt("frprvtSandCo")));
		if(!c.isNull("fireSensorCo")) this.setFireSensorCo(String.valueOf(c.getInt("fireSensorCo")));
		if(!c.isNull("themaEnvrnCl")) this.setThemaEnvrnCl(c.getString("themaEnvrnCl"));
		if(!c.isNull("eqpmnLendCl")) this.setEqpmnLendCl(c.getString("eqpmnLendCl"));
		if(!c.isNull("animalCmgCl")) this.setAnimalCmgCl(c.getString("animalCmgCl"));
		if(!c.isNull("tourEraCl")) this.setTourEraCl(c.getString("tourEraCl"));
		if(!c.isNull("firstImageUrl")) this.setFirstImageUrl(c.getString("firstImageUrl"));
		if(!c.isNull("createdtime")) this.setCreatedtime(c.getString("createdtime"));
		if(!c.isNull("modifiedtime")) this.setModifiedtime(c.getString("modifiedtime"));
	}
	public int getContentId() {return contentId;}
	public void setContentId(int contentId) {this.contentId = contentId;}
	
	public String getFacltNm() {	return facltNm;}
	public void setFacltNm(String facltNm) {this.facltNm = facltNm;}
	
	public String getLineIntro() {	return lineIntro;}
	public void setLineIntro(String lineIntro) {this.lineIntro = lineIntro;}
	
	public String getIntro() {	return intro;}
	public void setIntro(String intro) {this.intro = intro;}
	
	public String getAllar() {return allar;}
	public void setAllar(String allar) {this.allar = allar;}
	
	public String getInsrncAt() {return insrncAt;}
	public void setInsrncAt(String insrncAt) {this.insrncAt = insrncAt;}
	
	public String getTrsagntNo() {return trsagntNo;}
	public void setTrsagntNo(String trsagntNo) {this.trsagntNo = trsagntNo;}
	
	public String getBizrno() {return bizrno;}
	public void setBizrno(String bizrno) {this.bizrno = bizrno;}
	
	public String getFacltDivNm() {return facltDivNm;}
	public void setFacltDivNm(String facltDivNm) {this.facltDivNm = facltDivNm;}
	
	public String getMangeDivNm() {return mangeDivNm;}
	public void setMangeDivNm(String mangeDivNm) {this.mangeDivNm = mangeDivNm;}
	
	public String getMgcDiv() {return mgcDiv;}
	public void setMgcDiv(String mgcDiv) {this.mgcDiv = mgcDiv;}
	
	public String getManageSttus() {	return manageSttus;}
	public void setManageSttus(String manageSttus) {	this.manageSttus = manageSttus;}
	
	public String getHvofBgnde() {	return hvofBgnde;}
	public void setHvofBgnde(String hvofBgnde) {	this.hvofBgnde = hvofBgnde;}
	
	public String getHvofEnddle() {	return hvofEnddle;}
	public void setHvofEnddle(String hvofEnddle) {	this.hvofEnddle = hvofEnddle;}
	
	public String getFeatureNm() {	return featureNm;}
	public void setFeatureNm(String featureNm) {	this.featureNm = featureNm;}
	
	public String getInduty() {	return induty;}
	public void setInduty(String induty) {	this.induty = induty;}
	
	public String getLctCl() {	return lctCl;}
	public void setLctCl(String lctCl) {	this.lctCl = lctCl;}
	
	public String getDoNm() {	return doNm;}
	public void setDoNm(String doNm) {	this.doNm = doNm;}
	
	public String getSigunguNm() {	return sigunguNm;}
	public void setSigunguNm(String sigunguNm) {	this.sigunguNm = sigunguNm;}
	
	public String getZipcode() {	return zipcode;}
	public void setZipcode(String zipcode) {	this.zipcode = zipcode;}
	
	public String getAddr1() {	return addr1;}
	public void setAddr1(String addr1) {	this.addr1 = addr1;}
	
	public String getAddr2() {	return addr2;}
	public void setAddr2(String addr2) {	this.addr2 = addr2;}
	
	public String getMapX() {	return mapX;}
	public void setMapX(String mapX) {	this.mapX = mapX;}
	
	public String getMapY() {	return mapY;}
	public void setMapY(String mapY) {	this.mapY = mapY;}
	
	public String getDirection() {	return direction;}
	public void setDirection(String direction) {	this.direction = direction;}
	
	public String getTel() {	return tel;}
	public void setTel(String tel) {	this.tel = tel;}
	
	public String getHomepage() {	return homepage;}
	public void setHomepage(String homepage) {	this.homepage = homepage;}
	
	public String getResveUrl() {	return resveUrl;}
	public void setResveUrl(String resveUrl) {	this.resveUrl = resveUrl;}
	
	public String getResveCl() {	return resveCl;}
	public void setResveCl(String resveCl) {	this.resveCl = resveCl;}
	
	public String getManageNmpr() {	return manageNmpr;}
	public void setManageNmpr(String manageNmpr) {	this.manageNmpr = manageNmpr;}
	
	public String getGnrlSiteCo() {	return gnrlSiteCo;}
	public void setGnrlSiteCo(String gnrlSiteCo) {	this.gnrlSiteCo = gnrlSiteCo;}
	
	public String getAutoSiteCo() {	return autoSiteCo;}
	public void setAutoSiteCo(String autoSiteCo) {	this.autoSiteCo = autoSiteCo;}
	
	public String getGlampSiteCo() {	return glampSiteCo;}
	public void setGlampSiteCo(String glampSiteCo) {	this.glampSiteCo = glampSiteCo;}
	
	public String getCaramSiteCo() {	return caramSiteCo;}
	public void setCaramSiteCo(String caramSiteCo) {	this.caramSiteCo = caramSiteCo;}
	
	public String getIndvdlCaravSiteCo() {	return indvdlCaravSiteCo;}
	public void setIndvdlCaravSiteCo(String indvdlCaravSiteCo) {	this.indvdlCaravSiteCo = indvdlCaravSiteCo;}
	
	public String getSitedStnc() {	return sitedStnc;}
	public void setSitedStnc(String sitedStnc) {	this.sitedStnc = sitedStnc;}
	
	public String getSiteMg1Width() {	return siteMg1Width;}
	public void setSiteMg1Width(String siteMg1Width) {	this.siteMg1Width = siteMg1Width;}
	
	public String getSiteMg2Width() {	return siteMg2Width;}
	public void setSiteMg2Width(String siteMg2Width) {	this.siteMg2Width = siteMg2Width;}
	
	public String getSiteMg3Width() {	return siteMg3Width;}
	public void setSiteMg3Width(String siteMg3Width) {	this.siteMg3Width = siteMg3Width;}
	
	public String getSiteMg1Vrticl() {	return siteMg1Vrticl;}
	public void setSiteMg1Vrticl(String siteMg1Vrticl) {	this.siteMg1Vrticl = siteMg1Vrticl;}
	
	public String getSiteMg2Vrticl() {	return siteMg2Vrticl;}
	public void setSiteMg2Vrticl(String siteMg2Vrticl) {	this.siteMg2Vrticl = siteMg2Vrticl;}
	
	public String getSiteMg3Vrticl() {	return siteMg3Vrticl;}
	public void setSiteMg3Vrticl(String siteMg3Vrticl) {	this.siteMg3Vrticl = siteMg3Vrticl;}
	
	public String getSiteMg1Co() {	return siteMg1Co;}
	public void setSiteMg1Co(String siteMg1Co) {	this.siteMg1Co = siteMg1Co;}
	
	public String getSiteMg2Co() {	return siteMg2Co;}
	public void setSiteMg2Co(String siteMg2Co) {	this.siteMg2Co = siteMg2Co;}
	
	public String getSiteMg3Co() {	return siteMg3Co;}
	public void setSiteMg3Co(String siteMg3Co) {	this.siteMg3Co = siteMg3Co;}
	
	public String getSiteBottomCl1() {	return siteBottomCl1;}
	public void setSiteBottomCl1(String siteBottomCl1) {	this.siteBottomCl1 = siteBottomCl1;}
	
	public String getSiteBottomCl2() {	return siteBottomCl2;}
	public void setSiteBottomCl2(String siteBottomCl2) {	this.siteBottomCl2 = siteBottomCl2;}
	
	public String getSiteBottomCl3() {	return siteBottomCl3;}
	public void setSiteBottomCl3(String siteBottomCl3) {	this.siteBottomCl3 = siteBottomCl3;}
	
	public String getSiteBottomCl4() {	return siteBottomCl4;}
	public void setSiteBottomCl4(String siteBottomCl4) {	this.siteBottomCl4 = siteBottomCl4;}
	
	public String getSiteBottomCl5() {	return siteBottomCl5;}
	public void setSiteBottomCl5(String siteBottomCl5) {	this.siteBottomCl5 = siteBottomCl5;}
	
	public String getTooltip() {	return tooltip;}
	public void setTooltip(String tooltip) {	this.tooltip = tooltip;}
	
	public String getGlampInnerFclty() {	return glampInnerFclty;}
	public void setGlampInnerFclty(String glampInnerFclty) {	this.glampInnerFclty = glampInnerFclty;}
	
	public String getCaravInnerFclty() {	return caravInnerFclty;}
	public void setCaravInnerFclty(String caravInnerFclty) {	this.caravInnerFclty = caravInnerFclty;}
	
	public String getPrmisnDe() {	return prmisnDe;}
	public void setPrmisnDe(String prmisnDe) {	this.prmisnDe = prmisnDe;}
	
	public String getOperPdCl() {	return operPdCl;}
	public void setOperPdCl(String operPdCl) {	this.operPdCl = operPdCl;}
	
	public String getOperDeCl() {	return operDeCl;}
	public void setOperDeCl(String operDeCl) {	this.operDeCl = operDeCl;}
	
	public String getTrlerAcmpnyAt() {	return trlerAcmpnyAt;}
	public void setTrlerAcmpnyAt(String trlerAcmpnyAt) {	this.trlerAcmpnyAt = trlerAcmpnyAt;}
	
	public String getCaravAcmpnyAt() {	return caravAcmpnyAt;}
	public void setCaravAcmpnyAt(String caravAcmpnyAt) {	this.caravAcmpnyAt = caravAcmpnyAt;}
	
	public String getToiletCo() {	return toiletCo;}
	public void setToiletCo(String toiletCo) {	this.toiletCo = toiletCo;}
	
	public String getSwrmCo() {	return swrmCo;}
	public void setSwrmCo(String swrmCo) {	this.swrmCo = swrmCo;	}
	
	public String getWtrplCo() {	return wtrplCo;}
	public void setWtrplCo(String wtrplCo) {	this.wtrplCo = wtrplCo;}
	
	public String getBrazierCl() {	return brazierCl;}
	public void setBrazierCl(String brazierCl) {this.brazierCl = brazierCl;}
	
	public String getSbrsCl() {return sbrsCl;}
	public void setSbrsCl(String sbrsCl) {this.sbrsCl = sbrsCl;}
	
	public String getSbrsEtc() {	return sbrsEtc;}
	public void setSbrsEtc(String sbrsEtc) {this.sbrsEtc = sbrsEtc;	}
	
	public String getPosblFcltyCl() {return posblFcltyCl;}
	public void setPosblFcltyCl(String posblFcltyCl) {this.posblFcltyCl = posblFcltyCl;}
	
	public String getPosblFcltyEtc() {return posblFcltyEtc;}
	public void setPosblFcltyEtc(String posblFcltyEtc) {this.posblFcltyEtc = posblFcltyEtc;}
	
	public String getClturEventAt() {return clturEventAt;}
	public void setClturEventAt(String clturEventAt) {	this.clturEventAt = clturEventAt;}
	
	public String getClturEvent() {return clturEvent;}
	public void setClturEvent(String clturEvent) {this.clturEvent = clturEvent;}
	
	public String getExprnProgrmAt() {return exprnProgrmAt;}
	public void setExprnProgrmAt(String exprnProgrmAt) {this.exprnProgrmAt = exprnProgrmAt;}
	
	public String getExprnProgrm() {return exprnProgrm;}
	public void setExprnProgrm(String exprnProgrm) {this.exprnProgrm = exprnProgrm;}
	
	public String getExtshrCo() {return extshrCo;}
	public void setExtshrCo(String extshrCo) {this.extshrCo = extshrCo;}
	
	public String getFrprvtWrppCo() {return frprvtWrppCo;}
	public void setFrprvtWrppCo(String frprvtWrppCo) {this.frprvtWrppCo = frprvtWrppCo;}
	
	public String getFrprvtSandCo() {return frprvtSandCo;}
	public void setFrprvtSandCo(String frprvtSandCo) {this.frprvtSandCo = frprvtSandCo;}
	
	public String getFireSensorCo() {return fireSensorCo;}
	public void setFireSensorCo(String fireSensorCo) {this.fireSensorCo = fireSensorCo;}
	
	public String getThemaEnvrnCl() {return themaEnvrnCl;}
	public void setThemaEnvrnCl(String themaEnvrnCl) {this.themaEnvrnCl = themaEnvrnCl;}
	
	public String getEqpmnLendCl() {return eqpmnLendCl;}
	public void setEqpmnLendCl(String eqpmnLendCl) {this.eqpmnLendCl = eqpmnLendCl;}
	
	public String getAnimalCmgCl() {return animalCmgCl;}
	public void setAnimalCmgCl(String animalCmgCl) {this.animalCmgCl = animalCmgCl;}
	
	public String getTourEraCl() {return tourEraCl;}
	public void setTourEraCl(String tourEraCl) {this.tourEraCl = tourEraCl;}
	
	public String getFirstImageUrl() {return firstImageUrl;}
	public void setFirstImageUrl(String firstImageUrl) {this.firstImageUrl = firstImageUrl;}
	
	public String getCreatedtime() {return createdtime;}
	public void setCreatedtime(String createdtime) {this.createdtime = createdtime;}
	
	public String getModifiedtime() {return modifiedtime;}
	public void setModifiedtime(String modifiedtime) {this.modifiedtime = modifiedtime;}
	
}
