package com.exam.EmpSystem.mapp;

import java.util.List;

import org.mapstruct.Mapper;

import com.exam.EmpSystem.dto.SalaryDto;
import com.exam.EmpSystem.entity.Salary;

@Mapper(componentModel = "spring")
public interface SalaryMapper {
	// map entity to Dto
	SalaryDto mapToDto(Salary entity);

	// map Dto to entity
	Salary mapToEntity(SalaryDto dto);

	// map entities to Dtos
	List<SalaryDto> mapToDtos(List<Salary> entities);

	// map Dtos To entities
	List<Salary> mapToEntities(List<SalaryDto> dtos);
}
