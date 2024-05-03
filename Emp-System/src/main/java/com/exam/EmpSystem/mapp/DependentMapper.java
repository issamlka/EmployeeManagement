package com.exam.EmpSystem.mapp;

import java.util.List;

import org.mapstruct.Mapper;

import com.exam.EmpSystem.dto.DependentDto;
import com.exam.EmpSystem.entity.Dependent;

@Mapper( uses = {EmployeeMapper.class} ,componentModel = "spring")
public interface DependentMapper {
    //map entity to Dto
	DependentDto mapToDto(Dependent entity);
    //map Dto to entity
    Dependent mapToEntity(DependentDto dto);
    //map entities to Dtos
    List<DependentDto> mapToDtos(List<Dependent> entities);
    //map Dtos To entities
    List<Dependent> mapToEntities(List<DependentDto> dtos);

}
