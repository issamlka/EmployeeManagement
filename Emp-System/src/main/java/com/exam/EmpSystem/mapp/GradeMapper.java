package com.exam.EmpSystem.mapp;

import java.util.List;

import org.mapstruct.Mapper;


import com.exam.EmpSystem.dto.GradeDto;
import com.exam.EmpSystem.entity.Grade;


@Mapper(componentModel = "spring")
public interface GradeMapper {
    //map entity to Dto
	GradeDto mapToDto(Grade entity);
    //map Dto to entity
    Grade mapToEntity(GradeDto dto);
    //map entities to Dtos
    List<GradeDto> mapToDtos(List<Grade> entities);
    //map Dtos To entities
    List<Grade> mapToEntities(List<GradeDto> dtos);
}
