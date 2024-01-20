package com.example.student.service.mappers;

import com.example.student.dao.entities.Student;
import com.example.student.service.dtos.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    public StudentDTO fromEStudentToEStudentDto(Student student){
        return  modelMapper.map(student, StudentDTO.class );
    }

    public Student fromStudentDtoToStudent(StudentDTO studentDto) {
        return modelMapper.map(studentDto, Student.class);
    }
}
