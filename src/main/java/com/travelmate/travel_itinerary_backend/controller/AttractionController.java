package com.travelmate.travel_itinerary_backend.controller;

import com.travelmate.travel_itinerary_backend.model.Attraction;
import com.travelmate.travel_itinerary_backend.service.AttractionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.travelmate.travel_itinerary_backend.dto.ItineraryRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.travelmate.travel_itinerary_backend.service.ItineraryService;

import java.util.List;

@RestController
public class AttractionController {

    private final AttractionService attractionService;
    private final ItineraryService itineraryService;

    public AttractionController(
            AttractionService attractionService,
            ItineraryService itineraryService
    ) {
        this.attractionService = attractionService;
        this.itineraryService = itineraryService;
    }

    @GetMapping("/api/attractions")
    public List<Attraction> getAllAttractions() {
        return attractionService.getAllAttractions();
    }

    @PostMapping("/api/itinerary")
    public List<Attraction> generateItinerary(@RequestBody ItineraryRequest request) {
        return itineraryService.findMatchingAttractions(
                request.getDestination(),
                request.getInterests()
        );
    }
}