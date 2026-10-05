package com.travelmate.travel_itinerary_backend.dto;

import java.util.List;

public class ItineraryRequest {

    private String destination;
    private int days;
    private int hoursPerDay;
    private String walkingPreference;
    private List<String> interests;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public String getWalkingPreference() {
        return walkingPreference;
    }

    public void setWalkingPreference(String walkingPreference) {
        this.walkingPreference = walkingPreference;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}