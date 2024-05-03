package com.exam.EmpSystem.mapp;

import java.util.List;

import org.mapstruct.Mapper;

import com.exam.EmpSystem.dto.EmployeeDto;
import com.exam.EmpSystem.entity.Employee;

@Mapper( uses = {SalaryMapper.class,PhoneMapper.class,AddressMapper.class,SalaryMapper.class} ,componentModel = "spring")
public interface EmployeeMapper  {
    //map entity to Dto
	EmployeeDto mapToDto(Employee entity);
    //map Dto to entity
    Employee mapToEntity(EmployeeDto dto);
    //map entities to Dtos
    List<EmployeeDto> mapToDtos(List<Employee> entities);
    //map Dtos To entities
    List<Employee> mapToEntities(List<EmployeeDto> dtos);
}
