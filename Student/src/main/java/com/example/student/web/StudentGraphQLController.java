package com.example.student.web;

import com.example.student.service.StudentManager;
import com.example.student.service.dtos.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StudentGraphQLController {
    @Autowired
    private StudentManager studentManager;

    @QueryMapping
    public StudentDTO getStudentById(@Argument Long id){
        return studentManager.getStudentById(id);
    }
    
    @MutationMapping
    public StudentDTO saveStudent( @Argument StudentDTO studentDTO){
        return studentManager.saveStudent(studentDTO);
    }
}
