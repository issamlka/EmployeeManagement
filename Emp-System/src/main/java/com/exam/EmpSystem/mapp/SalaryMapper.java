package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.SalaryDto;
import com.exam.EmpSystem.entity.Salary;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface SalaryMapper extends BaseMapper<Salary, SalaryDto> {
}
