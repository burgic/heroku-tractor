package com.codeclan.example.TractorFactorPG.repositories;

import com.codeclan.example.TractorFactorPG.models.Inspector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InspectorRepository extends JpaRepository<Inspector, Long> {
    List<Inspector> findByLatGreaterThanAndLatLessThanAndLngGreaterThanAndLngLessThan(double minLat, double maxLat, double minLng, double maxLng);
    List<Inspector> findByTractorsManufacturerAndLatGreaterThanAndLatLessThanAndLngGreaterThanAndLngLessThan(String manufacturer, double minLat, double maxLat, double minLng, double maxLng);
    List<Inspector> findByNameContains(String name);
}
