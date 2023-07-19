package com.airlinereservation.airlinereservation.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.transaction.Transactional;

import com.airlinereservation.airlinereservation.model.Flight;
import com.airlinereservation.airlinereservation.model.Reservation;
import com.airlinereservation.airlinereservation.model.ReservationRequest;
import com.airlinereservation.airlinereservation.repository.FlightRepo;
import com.airlinereservation.airlinereservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * 1. create flight repo
 * 2. validate flight repo
 * 3. use the flightId to check if each flight has space ***/
@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    FlightRepo flightRepo;

//    @Autowired
//    FlightRepo flightRepo;

    public Reservation reserve(ReservationRequest reservationRequest) throws Exception {
        Reservation reservation = generateReservationFromRequest(reservationRequest);
//        Map<Flight, String> mapOfFlightNumber = new HashMap<>(getmapOfFlightNumberFromPostRequest(reservationRequest));

        if (canReserve(reservationRequest)) {
            return createReservationInDb(reservation);
        } else {
            //throw error/exception/error message
        }
        return null;
    }

    /**
     * list = [1,2,3,4]
     *
     * list.stream().map(number -> number = number+2).collect(Collector.toList());
     *
     *
     * @param reservationRequest
     * @return
     * @throws Exception
     */
    private Boolean canReserve(ReservationRequest reservationRequest) throws  Exception{

//            List<Flight> flightsInDb = flightRepo.findAllById(
//                    reservationRequest
//                            .getFlights()
//                            .stream()
//                            .flatMap(flight -> Stream.of(flight.getFlightId())).collect(Collectors.toList()))
//                            ;
//        Map<Flight,String> mapOfFlightNumber = new HashMap<>();

//        if(flightsInDb == null || flightsInDb.isEmpty())
//            return false;
//        for (Flight flight : flightsInDb) {
//            if (flight.getSeatsLeft() < reservationRequest.getNumberOfSeatsRequested()) {
//                throw new Exception("Not enough seat on flight "
//                        + flight.getFlightNumber()
//                        + ". Requested "
//                        + reservationRequest.getNumberOfSeatsRequested()
//                        + " and have "
//                        + flight.getSeatsLeft());
//            }
//        }
        return true;
    }

//    private String findFlightinRepo(Map<Flight,String> mapOfFlightNumber) {
//        for (Map.Entry<Flight,String> flight:mapOfFlightNumber.entrySet()){
//            if (flightRepo.findBy(flight.){
//                int seats=flightRepo.findBy(String.valueOf(flight.getKey()));
//            }
//        }
//    }

//fix the database mapping to create the reservation
    @Transactional
    Reservation createReservationInDb(Reservation reservation) {
        return reservationRepository.saveAndFlush(reservation);
    }

    //ToDO 1. starting from the number of flight seats everytime a post call is made and validation goes through for the ordernumber
//    we check the current capacity of the flight and check it against the number of flight seat requested in the post call
// if the number of flight seat requested is smaller than or equal to the current available capacity of the flight seats then
// a)we can reserve.
//     i)in that case the an ordernumber for each flight seat being booked is given to the passenger and an
//     ii)ordernumber is generated.
//     iii)that ordernumber
//  is saved in the Repo along with the passenger details. A message is to be sent out that the "reservation was successful, and a seat has been
//    booked by the given passenger.firstName +passenger.lastName
//
//    private boolean canReserve(Reservation reservation) {
//        for (Flight flight : reservation.getFlights()) {
//            if (flight instanceof FlightRepo .
//        }
//
//
//    }

    private Reservation generateReservationFromRequest(ReservationRequest reservationRequest) {
        Reservation reservation = new Reservation();
        reservation.setFlights( reservationRequest.getFlights().stream().collect(Collectors.toSet()));
        reservation.setPassenger(reservationRequest.getPassenger());
        return reservation;

    }
}
