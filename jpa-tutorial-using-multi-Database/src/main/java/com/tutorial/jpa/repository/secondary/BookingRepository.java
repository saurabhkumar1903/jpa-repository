package com.tutorial.jpa.repository.secondary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.jpa.dto.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	public List<Booking> findByName(String name);

}
