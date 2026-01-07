package com.example.Student.service;

import com.example.Student.entity.Student;
import com.example.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student){
       studentRepository.save(student);
        return student;
    }
}
