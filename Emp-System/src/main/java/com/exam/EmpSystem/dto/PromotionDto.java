package com.exam.EmpSystem.dto;

import com.exam.EmpSystem.entity.Employee;
import com.exam.EmpSystem.entity.Grade;
import com.exam.EmpSystem.entity.Salary;
import lombok.Data;

import java.util.Date;

@Data
public class PromotionDto {
    private Integer id ;
    private Employee employee ;
    private Grade grade ;
    private Date datePromotion ;
    private Salary salary ;
}
