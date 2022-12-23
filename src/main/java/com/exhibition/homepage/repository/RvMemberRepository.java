package com.exhibition.homepage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exhibition.homepage.entity.RvMember;

public interface RvMemberRepository extends JpaRepository<RvMember, Integer> {
	
	public Optional<RvMember> findByUserid(String mUserId);

}
