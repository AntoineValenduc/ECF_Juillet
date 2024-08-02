package com.ecfJuillet.back.repositories;

import com.ecfJuillet.back.entities.Progression;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressionRepository extends JpaRepository<Progression, Integer> {
}
