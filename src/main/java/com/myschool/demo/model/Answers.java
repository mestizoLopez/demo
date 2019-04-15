package com.myschool.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Answers {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String answers;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Questions question;


}
