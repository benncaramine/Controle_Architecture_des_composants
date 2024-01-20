package com.example.student.service;

import com.example.student.service.dtos.StudentDTO;

public interface StudentManagerImplementation {
    StudentDTO getStudentById(Long id);
    StudentDTO saveStudent(StudentDTO studentDTO);
}
