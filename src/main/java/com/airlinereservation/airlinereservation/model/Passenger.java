package com.airlinereservation.airlinereservation.model;

import javax.persistence.Embeddable;

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
//@Entity
@Embeddable
public class Passenger {
//    @Id
//    private String pnrNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String phone;
}
