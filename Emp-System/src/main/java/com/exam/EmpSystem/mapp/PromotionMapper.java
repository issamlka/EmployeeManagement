package com.exam.EmpSystem.mapp;


import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.PromotionDto;
import com.exam.EmpSystem.entity.Promotion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper( uses = {SalaryMapper.class,DesignationMapper.class,GradeMapper.class, EmployeeMapper.class} ,componentModel = "spring")
public interface PromotionMapper extends BaseMapper<Promotion,PromotionDto> {




}
