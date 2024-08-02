package com.ecfJuillet.back.services;

import com.ecfJuillet.back.entities.Level;
import com.ecfJuillet.back.entities.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface QuestionService {

    public List<Question> getQuestions();

    public Optional<Question> getQuestionById(int id);

    public List<Question> getQuestionByLevel(Level level);

}
