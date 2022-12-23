package com.exhibition.homepage.entity;

import javax.persistence.*;

public class RvMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(unique = true)//유저네임 칼럼에 유니크 속성 부여 -> 중복된 값 저장 불허용
	private String mUserId;//아이디
	
	private String mUserName;// 유저이름
	
	private String mPw; //비밀번호
	
	private String mEmail; //이메일

}
