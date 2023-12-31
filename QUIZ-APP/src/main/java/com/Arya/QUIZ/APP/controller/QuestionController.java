package com.Arya.QUIZ.APP.controller;
import java.util.List;

import com.Arya.QUIZ.APP.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arya.QUIZ.APP.Service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
        public List<Question> getAllQuestions(){
            return questionService.getAllQuestions();
        }
    
}
