package com.example.springdemo;

public class Student {
    private ExamNotes examNotes;

    // Injecting exam obj in Student
    // Here we are doing Dependency Injection without using @Autowired
    // When we have just one Constructor, we are not required to write @Autowired
    public Student(ExamNotes examNotes) {
        this.examNotes = examNotes;
    }

    public void display() {
        examNotes.display();
        System.out.println(examNotes);
        System.out.println("Student got the Exam Notes");
    }

}
