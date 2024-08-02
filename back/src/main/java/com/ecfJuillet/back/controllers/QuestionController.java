package com.ecfJuillet.back.controllers;

import com.ecfJuillet.back.entities.Question;
import com.ecfJuillet.back.services.QuestionService;
import com.ecfJuillet.back.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/quizgame/question")
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Question> getQuestions() {
        return service.getQuestions();
    }

    
}
