package com.exam.EmpSystem.mapp;


import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.GradeDto;
import com.exam.EmpSystem.entity.Grade;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GradeMapper extends BaseMapper<Grade,GradeDto> {


}
