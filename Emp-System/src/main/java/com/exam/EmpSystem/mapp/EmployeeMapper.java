package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.EmployeeDto;
import com.exam.EmpSystem.entity.Employee;
import org.mapstruct.Mapper;

@Mapper( uses = {SalaryMapper.class,PhoneMapper.class,AddressMapper.class} ,componentModel = "spring")
public interface EmployeeMapper extends BaseMapper <Employee, EmployeeDto> {
}
