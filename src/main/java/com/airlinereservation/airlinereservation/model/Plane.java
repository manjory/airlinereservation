package com.airlinereservation.airlinereservation.model;


import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable

public class Plane {

    private int capacity;
    private String model;
    private String manufacturer;
    private int yearOfManufacture;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
