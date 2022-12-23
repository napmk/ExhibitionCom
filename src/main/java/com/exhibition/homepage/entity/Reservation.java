package com.exhibition.homepage.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="reservation_tbl")
@SequenceGenerator ( name = "reservation_seq_generator",
						sequenceName = "reservation_seq",
						allocationSize =1)

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private  String rid; //번호
	 
	 private  String rTitle; //제목
	 
	 private  LocalDateTime rExhibitionDate; //전시회날짜
	 
	 private  LocalDateTime reserveDate;// 전시회 예매날짜
	 
	 private  String rticketNumber; //전시티켓번호
	 
	 private String rprice; //전시가격

	 private String rlike; //좋아요
	 
	 private String rPoster; //포스터이미지
}
