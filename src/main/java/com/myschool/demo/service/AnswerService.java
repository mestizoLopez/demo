package com.myschool.demo.service;

import com.myschool.demo.model.Answers;

import java.util.List;
import java.util.Optional;


public interface AnswerService {

    List<Answers> findAll();
    Optional<Answers> findById(Long id);
    Answers save(Answers answer);
    Answers findByQuestionId(Long id);

}
