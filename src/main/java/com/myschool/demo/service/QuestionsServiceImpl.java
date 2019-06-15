package com.myschool.demo.service;

import com.myschool.demo.model.Questions;
import com.myschool.demo.repo.QuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionsServiceImpl implements QuestionsService {

    @Autowired
    QuestionsRepo repo;

    @Override
    public List<Questions> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Questions> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Questions save(Questions question) {
        return repo.save(question);
    }


}
