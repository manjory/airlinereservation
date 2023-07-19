package com.airlinereservation.airlinereservation.service;

import java.util.Random;
import java.util.stream.Collectors;
import javax.transaction.Transactional;

import com.airlinereservation.airlinereservation.model.Flight;
import com.airlinereservation.airlinereservation.model.FlightInfo;
import com.airlinereservation.airlinereservation.repository.FlightInfoRepo;
import com.airlinereservation.airlinereservation.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** TODO 1. Create FlightTable
 * **/
@Service
public class FlightService {
    private final Long base= 10000000L;
    @Autowired
    FlightRepo flightRepo;

    @Autowired
    FlightInfoRepo flightInfoRepo;
    @Transactional
    public FlightInfo createFlight(FlightInfo flightInfo){
        return flightInfoRepo.saveAndFlush(flightInfo);

    }
    private FlightInfo generateFlightInfoFromRequest(FlightInfo flightInfo,Long generator) {
        FlightInfo flightInformation = new FlightInfo();
        flightInformation.setDestination(flightInfo.getDestination());
        flightInformation.setPrice(flightInfo.getPrice());
        flightInformation.setPlane(flightInfo.getPlane());
        flightInformation.setPassenger(flightInfo.getPassenger());
        flightInformation.setArrivalTime(flightInfo.getArrivalTime());
        flightInformation.setDepartureTime(flightInfo.getDepartureTime());
        flightInformation.setSource(flightInfo.getSource());
        flightInformation.setSeatsLeft(flightInfo.getSeatsLeft());
        return flightInformation;
    }
    /**
     * private Reservation generateReservationFromRequest(ReservationRequest reservationRequest) {
     *         Reservation reservation = new Reservation();
     *         reservation.setFlights( reservationRequest.getFlights().stream().collect(Collectors.toSet()));
     *         reservation.setPassenger(reservationRequest.getPassenger());
     *         return reservation;
     *
     *     }
     *
     * **/

}
