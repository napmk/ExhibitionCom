package com.exhibition.homepage.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exhibition.homepage.entity.RvMember;
import com.exhibition.homepage.exception.DataNotFoundException;
import com.exhibition.homepage.repository.RvMemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RvMemberService {

	private final RvMemberRepository rvMemberRepository;
	
	
	public RvMember memberCreate(String muserid, String musername, String mpw, String memail) {
		
		
		RvMember rvmember = new RvMember();
		rvmember.setMuserid(muserid);
		rvmember.setMusername(musername);
		rvmember.setMpw(mpw);
		rvmember.setMemail(memail);
		
		rvMemberRepository.save(rvmember);
		
	    return rvmember;
		

		
	}
	
	public RvMember getMemberInfo(String muserid) {
		Optional<RvMember> optRvMember =  rvMemberRepository.findByMuserid(muserid) ;
		
		if(optRvMember.isPresent()) {
			RvMember rvMember = optRvMember.get();
			return rvMember;
		}else {
			throw new DataNotFoundException("유저를 찾을 수 없습니다.");
		}
	}
	
}
