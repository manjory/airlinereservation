package com.airlinereservation.airlinereservation.model;

import java.util.List;

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
public class ReservationRequest {
    private Passenger passenger;
    private List<Flight> flights;
    private int numberOfSeatsRequested;
}
