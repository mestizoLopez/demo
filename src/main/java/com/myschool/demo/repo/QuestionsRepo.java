package com.myschool.demo.repo;

import com.myschool.demo.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionsRepo extends JpaRepository<Questions,Long> {


}
