package com.exhibition.homepage.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RvQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;//질문게시판 번호

	@Column(length = 100)
	private String subject;//질문게시판 제목

	@Column(length = 1000)
	private String content;//질문게시판 내용

	private LocalDateTime createDate;//글 등록일시
	
	@OneToMany(mappedBy = "rvquestion", cascade = CascadeType.REMOVE)
	private List<RvAnswer> answerList;//1:n 구조

}