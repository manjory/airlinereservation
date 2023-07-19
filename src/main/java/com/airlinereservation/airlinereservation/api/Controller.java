package com.airlinereservation.airlinereservation.api;

import com.airlinereservation.airlinereservation.model.FlightInfo;
import com.airlinereservation.airlinereservation.model.Flight;
import com.airlinereservation.airlinereservation.model.Reservation;
import com.airlinereservation.airlinereservation.model.ReservationRequest;
import com.airlinereservation.airlinereservation.service.FlightService;
import com.airlinereservation.airlinereservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Controller {
    @Autowired
    ReservationService reservationService;
    @Autowired
    FlightService flightService;

//    @GetMapping
//    public Flight flightInformation(@RequestBody String flightNumber){
//        return
//
//    }
    @PostMapping
    public Reservation reservationReq(@RequestBody ReservationRequest reservationRequest) throws Exception {
//        Reservation reservation=new Reservation();
//        reservation.setFlights(reservationRequest.getFlights());
//        reservation.setPassenger(reservationRequest.getPassenger());
        validateRequest(reservationRequest);
        return reservationService.reserve(reservationRequest);

    }
@PostMapping(path = "http://localhost:8080/api/flight")
public  FlightInfo addFlights(@RequestBody FlightInfo flightInfo){
        validateFlightInfo(flightInfo);
        return flightService.createFlight(flightInfo);
}
    @PostMapping
    public Reservation updateReservation(@RequestBody ReservationRequest reservationRequest){
        Reservation reservation=new Reservation();
        return reservation;
    }

    private boolean validateFlightInfo(FlightInfo flightInfo) {
        return true;
    }

    private void validateRequest(ReservationRequest reservationRequest) {
    }

}
