package com.Arya.QUIZ.APP.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Arya.QUIZ.APP.Question;
@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {  
}