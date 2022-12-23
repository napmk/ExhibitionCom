//package com.exhibition.homepage.service;
//
//import java.util.Optional;
//
//import com.exhibition.homepage.entity.RvMember;
//import com.exhibition.homepage.repository.RvMemberRepository;
//
//public class RvMemberService {
//
//	private final RvMemberRepository rvMemberRepository;
//	
//	
//	public RvMember  memberCreate(String mUserId, String mUserName, String mPw, String mEmail) {
//		
//		
//		RvMember rvmember = new RvMember();
//		
//	
//		
////		rvmember.setUserId(mUserId);
////		rvmember.setUsername(mUserName);
////		//member.setPassword(password);//해시알고리즘으로 처리해줘야함.
////	//	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
////		rvmember.setPassword(passwordEncoder.encode(mPw));
////		
////		rvmember.setEmail(mEmail);
////		
////		rvMemberRepository.save(rvmember);
////		
////		return rvmember;
//		
//	}
//	
//	public RvMember getMemberInfo(String mUserId) {
//		Optional<RvMember> optSiteMember =  rvMemberRepository.findByUserid(mUserId);
//		
//		if(optSiteMember.isPresent()) {
//			RvMember rvMember = optSiteMember.get();
//			return rvMember;
//		}else {
//			throw new DataNotFoundException("유저를 찾을 수 없습니다.");
//		}
//	}
//	
//}
