package com.example.student.service.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentDTO {

    private long id;
    private String name;
    private String email;
    private Date dateNaissance;
}
