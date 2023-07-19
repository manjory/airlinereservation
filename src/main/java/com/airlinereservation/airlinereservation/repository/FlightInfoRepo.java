package com.airlinereservation.airlinereservation.repository;

import com.airlinereservation.airlinereservation.model.Flight;
import com.airlinereservation.airlinereservation.model.FlightInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightInfoRepo extends JpaRepository<FlightInfo,Long>{
}
