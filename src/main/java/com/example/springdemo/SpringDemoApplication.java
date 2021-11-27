package com.example.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemoApplication.class);

        // Exam object is with Spring IOC, as we have defined bean for Exam in JavaConfig class
        // In JavaConfig class we have given the bean name "finalExamination"
        ExamNotes examNotes = context.getBean("finalExamination", ExamNotes.class);
        examNotes.display();
        System.out.println(examNotes);

        // Student object is with Spring IOC, as we have defined bean for Student in JavaConfig class
        Student student = context.getBean("getStudent", Student.class);
        student.display();
        System.out.println(student);

        // Exam object is with Spring IOC, as we have added @Component with class ExamPapers
        // All classes with @Component -> bean created and managed by Spring IOC
        // @Component  is searched as we have used @ComponentScan in main class
        ExamPapers examPapers = context.getBean(ExamPapers.class);
        examPapers.getExamPapers();
        System.out.println(examPapers);

        // Teacher object is with Spring IOC, as we have added @Component with class Teacher
        // All classes with @Component -> bean created and managed by Spring IOC
        // @Component  is searched as we have used @ComponentScan in main class
        Teacher teacher = context.getBean(Teacher.class);
        teacher.giveExamPapers();
        System.out.println(teacher);
    }
}
