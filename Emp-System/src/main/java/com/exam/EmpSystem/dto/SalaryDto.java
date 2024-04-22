package com.exam.EmpSystem.dto;

import com.exam.EmpSystem.entity.Employee;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class SalaryDto {

    private Integer id ;
    private Date date ;
    private String salary ;
    private List<Employee> employees ;
}
