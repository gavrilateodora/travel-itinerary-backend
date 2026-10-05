package com.travelmate.travel_itinerary_backend.dto;

import java.util.List;

public class ItineraryResponse {

    private List<ItineraryDay> days;

    public ItineraryResponse(List<ItineraryDay> days) {
        this.days = days;
    }

    public List<ItineraryDay> getDays() {
        return days;
    }
}