package com.exhibition.homepage.dto;


import java.time.LocalDateTime;
import java.util.List;

import com.exhibition.homepage.entity.RvAnswer;

import lombok.Data;

@Data
public class QuestionDto {

	private Integer id;
	private String subject;
	private String content;
	private LocalDateTime createDate;

	private List<RvAnswer> answers;

}