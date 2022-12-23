package com.exhibition.homepage.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ReservationDto {
	 private String rid; //번호
	 private String rTitle; //제목
	 private String rPoster; //포스터이미지
	 private LocalDateTime rExhibitionDate; //전시회날짜
	 private LocalDateTime reserveDate;// 전시회 예매날짜
	 private String rticketNumber; //전시티켓번호
	 private String rPrice; //전시가격
	 private String rLike; //좋아요
}
