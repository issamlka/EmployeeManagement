package com.exam.EmpSystem.dto;

import com.exam.EmpSystem.entity.Employee;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DependentDto
{
    private Integer id ;
    private String name ;
    private Date date ;
    private List<EmployeeDto> employees;
}
