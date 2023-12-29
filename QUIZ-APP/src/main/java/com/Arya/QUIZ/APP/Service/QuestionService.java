package com.Arya.QUIZ.APP.Service;
import com.Arya.QUIZ.APP.dao.QuestionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Arya.QUIZ.APP.Question;
@Service
public class QuestionService {
@Autowired
QuestionDao questionDao;
    public List<Question> getAllQuestions() {
       return questionDao.findAll();
    }
    
}
