package com.ecfJuillet.back.repositories;

import com.ecfJuillet.back.entities.Level;
import com.ecfJuillet.back.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    public Question findByLevel(Level level);
}
