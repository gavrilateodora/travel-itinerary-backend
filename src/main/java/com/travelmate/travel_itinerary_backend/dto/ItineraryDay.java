package com.travelmate.travel_itinerary_backend.dto;

import com.travelmate.travel_itinerary_backend.model.Attraction;

import java.util.List;

public class ItineraryDay {

    private int day;
    private List<Attraction> attractions;

    public ItineraryDay(int day, List<Attraction> attractions) {
        this.day = day;
        this.attractions = attractions;
    }

    public int getDay() {
        return day;
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }
}