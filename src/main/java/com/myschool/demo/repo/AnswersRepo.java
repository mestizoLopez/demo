package com.myschool.demo.repo;

import com.myschool.demo.model.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnswersRepo extends JpaRepository<Answers,Long> {

    @Query("SELECT a FROM Answers a, Questions q  WHERE q.id =:questionId")
    Answers findByQuestionId(@Param("questionId")Long id);

}
