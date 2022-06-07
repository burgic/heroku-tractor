package com.codeclan.example.spring.boot.TractorFactorPG.repositories;

import com.codeclan.example.spring.boot.TractorFactorPG.models.Tractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TractorRepository extends JpaRepository<Tractor, Long> {

}
