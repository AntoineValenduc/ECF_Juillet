package com.ecfJuillet.back.services.impl;

import com.ecfJuillet.back.entities.Level;
import com.ecfJuillet.back.entities.Question;
import com.ecfJuillet.back.repositories.QuestionRepository;
import com.ecfJuillet.back.services.QuestionService;

import java.util.List;
import java.util.Optional;

public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Optional<Question> getQuestionById(int id) {
        return questionRepository.findById(id);
    }

    @Override
    public List<Question> getQuestionByLevel(Level level) {
        return (List<Question>) questionRepository.findByLevel(level);
    }
}
