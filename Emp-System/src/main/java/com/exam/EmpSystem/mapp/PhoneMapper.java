package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.PhoneDto;
import com.exam.EmpSystem.entity.Phone;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PhoneMapper extends BaseMapper<Phone, PhoneDto> {
}
