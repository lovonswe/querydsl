package com.example.querydsl.service;

import com.example.querydsl.dto.StudentDetailsDto;
import com.example.querydsl.model.Student;
import com.example.querydsl.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDetailsDto> getStudentDetails(){
        List<Student> students = studentRepository.findAll();
        System.out.println("xxxxx");
        log.info("{}", students.get(0));
        return students
                .stream()
                .map(student -> mapStudentToStudentDetailsDto(student))
                .collect(Collectors.toList());
    }

    public StudentDetailsDto mapStudentToStudentDetailsDto(Student student) {
        StudentDetailsDto studentDetailsDto = new StudentDetailsDto(
                student.getId(),
                student.getName(),
                student.getAddress().getDistrict(),
                student.getAddress().getThana(),
                student.getCourse().getTitle()
        );
        return studentDetailsDto;
    }
}
