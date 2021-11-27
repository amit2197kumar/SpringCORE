package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    private ExamPapers examPapers;

    // Injecting ExamPapers obj in Teacher
    // Here we are doing Dependency Injection using @Autowired
    // @Component been used with class ExamPapers
    @Autowired
    public Teacher(ExamPapers examPapers) {
        this.examPapers = examPapers;
    }

    public Teacher() {
        System.out.println("Default Constructor");
    }

    public void giveExamPapers() {
        examPapers.getExamPapers();
        System.out.println(examPapers);
        System.out.println("Teacher got the Exam Papers");
    }
}
