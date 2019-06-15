package com.myschool.demo.service;

import com.myschool.demo.model.Answers;
import com.myschool.demo.model.Questions;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface QuestionsService {

    List<Questions> findAll();
    Optional<Questions> findById(Long id);
    Questions save(Questions questions);

}
