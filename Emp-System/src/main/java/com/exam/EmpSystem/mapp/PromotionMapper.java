package com.exam.EmpSystem.mapp;

import java.util.List;

import org.mapstruct.Mapper;

import com.exam.EmpSystem.dto.PromotionDto;
import com.exam.EmpSystem.entity.Promotion;


@Mapper( uses = {EmployeeMapper.class,GradeMapper.class, SalaryMapper.class, DesignationMapper.class} ,componentModel = "spring")
public interface PromotionMapper {
    //map entity to Dto
	PromotionDto mapToDto(Promotion entity);
    //map Dto to entity
    Promotion mapToEntity(PromotionDto dto);
    //map entities to Dtos
    List<PromotionDto> mapToDtos(List<Promotion> entities);
    //map Dtos To entities
    List<Promotion> mapToEntities(List<PromotionDto> dtos);
}
