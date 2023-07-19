package com.airlinereservation.airlinereservation.model;


import javax.persistence.Embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FlightInfo {
    private String source;
    private String destination;
    private String price;
    private String departureTime;
    private String arrivalTime;
    private int seatsLeft;
    @Embedded
    private Plane plane;
    private Passenger passenger;

}
