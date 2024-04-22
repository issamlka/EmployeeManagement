package com.exam.EmpSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
@Entity
public class Dependent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String name ;
    private Date date ;
    @OneToMany
    private List<Employee> employees;
}
