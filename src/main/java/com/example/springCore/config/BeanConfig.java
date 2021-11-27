package com.example.springCore.config;

import com.example.springCore.entity.ExamNotes;
import com.example.springCore.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean(name = {"finalExamination","semiFinalExamination"})
    @Scope(value="prototype")
    public ExamNotes getExam() {
        return new ExamNotes();
    }

    @Bean
    public Student getStudent() {
        Student student = new Student(getExam());
        return student;
    }
}
