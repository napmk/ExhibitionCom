package com.exhibition.homepage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exhibition.homepage.entity.Reservation;

public interface ReservationRepository extends  JpaRepository<Reservation,String>{

}
