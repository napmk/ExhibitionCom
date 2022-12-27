package com.exhibition.homepage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exhibition.homepage.entity.RvQuestion;

public interface QuestionRepository extends JpaRepository<RvQuestion, Integer>{
	
	public List<RvQuestion> findBySubject(String subject);
	//제목과 정확히 모두 일치하는 글 찾기

	public List<RvQuestion> findBySubjectLike(String subject);
	//제목에 특정 낱말이 포함되어 있는 글 찾기

	public List<RvQuestion> findBySubjectOrderByIdDesc(String subject);
	//제목과 정확히 모두 일치하는 글 찾은 후 id의 내림차순으로 정렬하여 반환


}
