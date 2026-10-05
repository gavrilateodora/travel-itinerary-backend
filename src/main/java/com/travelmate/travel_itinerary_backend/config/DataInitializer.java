package com.travelmate.travel_itinerary_backend.config;

import com.travelmate.travel_itinerary_backend.model.Attraction;
import com.travelmate.travel_itinerary_backend.repository.AttractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(AttractionRepository attractionRepository) {
        return args -> {

            if (!attractionRepository.existsByName("Eiffel Tower")) {
                Attraction eiffelTower = new Attraction();
                eiffelTower.setName("Eiffel Tower");
                eiffelTower.setCity("Paris");
                eiffelTower.setCategory("Landmarks");
                eiffelTower.setLatitude(48.8584);
                eiffelTower.setLongitude(2.2945);
                eiffelTower.setPrice(35);
                eiffelTower.setVisitDurationMinutes(120);
                eiffelTower.setOpeningHours("09:00-23:45");

                attractionRepository.save(eiffelTower);
            }

            if (!attractionRepository.existsByName("Louvre Museum")) {
                Attraction louvreMuseum = new Attraction();
                louvreMuseum.setName("Louvre Museum");
                louvreMuseum.setCity("Paris");
                louvreMuseum.setCategory("Museums");
                louvreMuseum.setLatitude(48.8606);
                louvreMuseum.setLongitude(2.3376);
                louvreMuseum.setPrice(22);
                louvreMuseum.setVisitDurationMinutes(180);
                louvreMuseum.setOpeningHours("09:00-18:00");

                attractionRepository.save(louvreMuseum);
            }

            if (!attractionRepository.existsByName("Musée d'Orsay")) {
                Attraction museeOrsay = new Attraction();
                museeOrsay.setName("Musée d'Orsay");
                museeOrsay.setCity("Paris");
                museeOrsay.setCategory("Art");
                museeOrsay.setLatitude(48.8600);
                museeOrsay.setLongitude(2.3266);
                museeOrsay.setPrice(16);
                museeOrsay.setVisitDurationMinutes(150);
                museeOrsay.setOpeningHours("09:30-18:00");

                attractionRepository.save(museeOrsay);
            }

            if (!attractionRepository.existsByName("Notre-Dame Cathedral")) {
                Attraction notreDame = new Attraction();
                notreDame.setName("Notre-Dame Cathedral");
                notreDame.setCity("Paris");
                notreDame.setCategory("History");
                notreDame.setLatitude(48.8530);
                notreDame.setLongitude(2.3499);
                notreDame.setPrice(0);
                notreDame.setVisitDurationMinutes(90);
                notreDame.setOpeningHours("08:00-18:45");

                attractionRepository.save(notreDame);
            }

            if (!attractionRepository.existsByName("Arc de Triomphe")) {
                Attraction arcDeTriomphe = new Attraction();
                arcDeTriomphe.setName("Arc de Triomphe");
                arcDeTriomphe.setCity("Paris");
                arcDeTriomphe.setCategory("Landmarks");
                arcDeTriomphe.setLatitude(48.8738);
                arcDeTriomphe.setLongitude(2.2950);
                arcDeTriomphe.setPrice(16);
                arcDeTriomphe.setVisitDurationMinutes(60);
                arcDeTriomphe.setOpeningHours("10:00-23:00");

                attractionRepository.save(arcDeTriomphe);
            }

            if (!attractionRepository.existsByName("Luxembourg Gardens")) {
                Attraction luxembourgGardens = new Attraction();
                luxembourgGardens.setName("Luxembourg Gardens");
                luxembourgGardens.setCity("Paris");
                luxembourgGardens.setCategory("Nature");
                luxembourgGardens.setLatitude(48.8462);
                luxembourgGardens.setLongitude(2.3372);
                luxembourgGardens.setPrice(0);
                luxembourgGardens.setVisitDurationMinutes(90);
                luxembourgGardens.setOpeningHours("07:30-20:00");

                attractionRepository.save(luxembourgGardens);
            }
        };
    }
}