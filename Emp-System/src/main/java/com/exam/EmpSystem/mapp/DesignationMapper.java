package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.DesignationDto;
import com.exam.EmpSystem.entity.Designation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DesignationMapper extends BaseMapper<Designation, DesignationDto> {
}
