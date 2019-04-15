package com.myschool.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Questions {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String Question;

    @OneToMany(mappedBy = "question")
    private List<Answers> answers;

}
