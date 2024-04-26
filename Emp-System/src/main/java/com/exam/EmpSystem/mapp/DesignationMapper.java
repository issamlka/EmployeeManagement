package com.exam.EmpSystem.mapp;


import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.DesignationDto;
import com.exam.EmpSystem.entity.Designation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DesignationMapper extends BaseMapper<Designation,DesignationDto> {



}
