package com.exam.EmpSystem.dto;

import com.exam.EmpSystem.entity.Address;
import com.exam.EmpSystem.entity.Employee;
import com.exam.EmpSystem.entity.Phone;
import lombok.Data;

@Data
public class EmployeeDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private AddressDto address;
    private String email;
    private PhoneDto phone;
    private SalaryDto salary;
    private EmployeeDto manager ;
}
