package com.example.student.service;

import com.example.student.dao.repositories.StudentRepository;
import com.example.student.service.dtos.StudentDTO;
import com.example.student.service.mappers.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentManager implements StudentManagerImplementation {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public StudentDTO getStudentById(Long id) {
        return studentMapper.fromEStudentToEStudentDto(studentRepository.findById(id).get());
    }
    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        return studentMapper.fromEStudentToEStudentDto(studentRepository.save(studentMapper.fromStudentDtoToStudent(studentDTO)));

    }
}




