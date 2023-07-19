package com.airlinereservation.airlinereservation.repository;

import com.airlinereservation.airlinereservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long>{


}
