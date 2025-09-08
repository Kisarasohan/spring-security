package com.example.demo.controller;


import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController {

    public List<Student> Students = new ArrayList<>(List.of(
            new Student(1, "John Doe"),
            new Student(2, "Jane Smith"),
            new Student(3, "Jim Brown"))
    );

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return Students;
    }

    @PostMapping("/students")
    public List<Student> addStudent(@RequestBody Student student) {
        Students.add(student);
        return Students;
    }
}
