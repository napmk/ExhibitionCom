package com.exhibition.homepage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exhibition.homepage.dto.ReservationDto;
import com.exhibition.homepage.entity.Reservation;
import com.exhibition.homepage.repository.ReservationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationService {
	private final ReservationRepository ReservationRepository;
	
	
	public List<Reservation> getList(){
		List<Reservation> reservations = ReservationRepository.findAll();
		
		List<ReservationDto> reservationsDtos = new ArrayList<ReservationDto>();
		
		return reservations;
	}
	
}