package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.DependentDto;
import com.exam.EmpSystem.entity.Dependent;
import org.mapstruct.Mapper;

@Mapper( uses = {EmployeeMapper.class} ,componentModel = "spring")
public interface DependentMapper extends BaseMapper <Dependent, DependentDto> {

}
