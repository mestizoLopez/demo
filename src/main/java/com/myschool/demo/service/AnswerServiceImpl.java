package com.myschool.demo.service;

import com.myschool.demo.model.Answers;
import com.myschool.demo.repo.AnswersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService{

    @Autowired
    private AnswersRepo repo;


    @Override
    public List<Answers> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Answers> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Answers save(Answers answer) {
        return repo.save(answer);
    }

    @Override
    public Answers findByQuestionId(Long id) {

        return repo.findByQuestionId(id);
    }


}
