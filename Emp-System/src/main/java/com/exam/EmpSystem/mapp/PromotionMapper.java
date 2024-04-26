package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.PromotionDto;
import com.exam.EmpSystem.entity.Promotion;
import org.mapstruct.Mapper;


@Mapper( uses = {EmployeeMapper.class,GradeMapper.class, SalaryMapper.class, DesignationMapper.class} ,componentModel = "spring")
public interface PromotionMapper extends BaseMapper<Promotion, PromotionDto> {
}
