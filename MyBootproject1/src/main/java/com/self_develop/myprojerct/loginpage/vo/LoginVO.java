package com.self_develop.myprojerct.loginpage.vo;

public class LoginVO {
	int u_no = 0;					//회원번호(회원인덱스)
	String user_id = "";			//아이디(이메일)
	String user_pwd = "";			//비밀번호(문자+숫자+특수문자 포함 8자 이상)
	String user_nm = "";			//이름
	String user_var_nm = "";		//닉네임
	
	String user_birth = "";			//생년월일(yyyymmdd)
	String user_gender = "";		//성별(man, woman)
	String user_phonno = "";		//전화번호(000-0000-0000)
	String user_email = "";			//이메일(인증코드, 비밀번호찾기 등)
	String user_address = "";		//주소
	
	String user_grant = "";			//회원구분(등급별 쿠폰제공)(기본회원(default), vip,vvip)
	String user_start_date = "";	//가입일자
	String user_update_day = "";	//최근 정보 수정일자
	String user_ip = "";			//로그인 사용자 IP 주소(로그인 정보보호용도)
	String user_emailkey = "";		//이메일 인증키
	
	String user_email_ck = "";		//이메일 인증 체크

	public int getU_no() {
		return u_no;
	}

	public void setU_no(int u_no) {
		this.u_no = u_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}

	public String getUser_var_nm() {
		return user_var_nm;
	}

	public void setUser_var_nm(String user_var_nm) {
		this.user_var_nm = user_var_nm;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_phonno() {
		return user_phonno;
	}

	public void setUser_phonno(String user_phonno) {
		this.user_phonno = user_phonno;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_grant() {
		return user_grant;
	}

	public void setUser_grant(String user_grant) {
		this.user_grant = user_grant;
	}

	public String getUser_start_date() {
		return user_start_date;
	}

	public void setUser_start_date(String user_start_date) {
		this.user_start_date = user_start_date;
	}

	public String getUser_update_day() {
		return user_update_day;
	}

	public void setUser_update_day(String user_update_day) {
		this.user_update_day = user_update_day;
	}

	public String getUser_ip() {
		return user_ip;
	}

	public void setUser_ip(String user_ip) {
		this.user_ip = user_ip;
	}

	public String getUser_emailkey() {
		return user_emailkey;
	}

	public void setUser_emailkey(String user_emailkey) {
		this.user_emailkey = user_emailkey;
	}

	public String getUser_email_ck() {
		return user_email_ck;
	}

	public void setUser_email_ck(String user_email_ck) {
		this.user_email_ck = user_email_ck;
	}
	
	
	
}
