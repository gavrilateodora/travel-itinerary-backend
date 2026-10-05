package com.travelmate.travel_itinerary_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private String category;

    private double latitude;
    private double longitude;

    private double price;
    private int visitDurationMinutes;
    private String openingHours;

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getPrice() {
        return price;
    }

    public int getVisitDurationMinutes() {
        return visitDurationMinutes;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVisitDurationMinutes(int visitDurationMinutes) {
        this.visitDurationMinutes = visitDurationMinutes;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}