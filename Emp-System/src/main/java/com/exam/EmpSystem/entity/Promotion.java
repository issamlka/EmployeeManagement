package com.exam.EmpSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Promotion   {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Grade grade ;
    private Date datePromotion ;
    @OneToOne
    private Salary salary ;
    @ManyToOne
    private Designation designation;



}
