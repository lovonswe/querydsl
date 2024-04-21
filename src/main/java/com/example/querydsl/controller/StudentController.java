package com.example.querydsl.controller;

import com.example.querydsl.dto.StudentDetailsDto;
import com.example.querydsl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentDetailsDto> getStudentDetails() {
        int number=9;
        return studentService.getStudentDetails();
    }
}
