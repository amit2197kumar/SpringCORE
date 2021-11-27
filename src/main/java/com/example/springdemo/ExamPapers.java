package com.example.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ExamPapers {

    @PostConstruct
    public void testPostConstructFunction() {
        System.out.println("Testing @PostConstruct functionality");
    }

    public void getExamPapers() {
        System.out.println("Returning Exam Papers");
    }

    @PreDestroy
    public void testPreDestroyFunction() {
        System.out.println("Testing @PreDestroy functionality");
    }
}

