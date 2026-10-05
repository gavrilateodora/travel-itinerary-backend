package com.travelmate.travel_itinerary_backend.service;

import com.travelmate.travel_itinerary_backend.model.Attraction;
import com.travelmate.travel_itinerary_backend.repository.AttractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionService {

    private final AttractionRepository attractionRepository;

    public AttractionService(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    public List<Attraction> getAllAttractions() {
        return attractionRepository.findAll();
    }

    public List<Attraction> findMatchingAttractions(
            String destination,
            List<String> interests
    ) {
        return attractionRepository.findByCityAndCategoryIn(
                destination,
                interests
        );
    }
}