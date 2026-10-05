package com.travelmate.travel_itinerary_backend.repository;

import com.travelmate.travel_itinerary_backend.model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {

    boolean existsByName(String name);

    List<Attraction> findByCityAndCategoryIn(
            String city,
            List<String> categories
    );
}