package com.myschool.demo.controller;

import com.myschool.demo.model.Answers;
import com.myschool.demo.model.Questions;
import com.myschool.demo.service.AnswerService;
import com.myschool.demo.service.QuestionsService;
import com.myschool.demo.utils.UtilsClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class TestController {

    Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    AnswerService aService;

    @Autowired
    QuestionsService qService;

    @GetMapping(value = "/answer/{id}")
    public Answers answerByQuestionId(@PathVariable Long id){

        return aService.findByQuestionId(id);
    }

    @GetMapping(value = "/index")
    public Questions questions(){

        List<Questions> questionList = qService.findAll();
        final Long size = (long)UtilsClass.getRandomDoubleBetweenRange(1,questionList.size());
        log.info("size "+size);
        Optional<Questions> opt = qService.findById(size);

        return opt.get();

    }

    @GetMapping(value = "/answers")
    public String answers(Model model){

        model.addAttribute("test","test");
        return "answers";
    }

}
