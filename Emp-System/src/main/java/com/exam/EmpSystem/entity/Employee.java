package com.exam.EmpSystem.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToOne
    private Salary salary;
    @ManyToOne
    private Address address;
    @ManyToOne
    private Phone phone;
    @ManyToOne
    private Employee manager ;


}
