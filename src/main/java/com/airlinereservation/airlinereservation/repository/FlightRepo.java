package com.airlinereservation.airlinereservation.repository;

import com.airlinereservation.airlinereservation.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight,Long>{
}
