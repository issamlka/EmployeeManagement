package com.exam.EmpSystem.mapp;

import java.util.List;

import org.mapstruct.Mapper;


import com.exam.EmpSystem.dto.DesignationDto;
import com.exam.EmpSystem.entity.Designation;

@Mapper(componentModel = "spring")
public interface DesignationMapper {
	
    //map entity to Dto
	DesignationDto mapToDto(Designation entity);
    //map Dto to entity
    Designation mapToEntity(DesignationDto dto);
    //map entities to Dtos
    List<DesignationDto> mapToDtos(List<Designation> entities);
    //map Dtos To entities
    List<Designation> mapToEntities(List<DesignationDto> dtos);
}
