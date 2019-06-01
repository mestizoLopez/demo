package com.myschool.demo.repo;

import com.myschool.demo.model.Answers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswersRepo extends JpaRepository<Answers,Long> {



}
