package com.airlinereservation.airlinereservation.model;



import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
@Entity
public class Flight {

    private String source;
    private String destination;
    private String price;
    private String departureTime;
    private String arrivalTime;
    private int seatsLeft;
    @Embedded
    private Plane plane;
    @Embedded
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name="reservation")
    private Reservation reservation;
    @Id
    private Long flightId;


    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public Long getFlightId() {
        return flightId;
    }
}
