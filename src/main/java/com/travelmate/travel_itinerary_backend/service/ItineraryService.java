package com.travelmate.travel_itinerary_backend.service;

import com.travelmate.travel_itinerary_backend.model.Attraction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItineraryService {

    private final AttractionService attractionService;

    public ItineraryService(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    public List<Attraction> findMatchingAttractions(
            String destination,
            List<String> interests
    ) {
        return attractionService.findMatchingAttractions(
                destination,
                interests
        );
    }
}