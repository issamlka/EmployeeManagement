package com.exam.EmpSystem.mapp;

import java.util.List;

import org.mapstruct.Mapper;


import com.exam.EmpSystem.dto.PhoneDto;
import com.exam.EmpSystem.entity.Phone;


@Mapper(componentModel = "spring")
public interface PhoneMapper {
    //map entity to Dto
	PhoneDto mapToDto(Phone entity);
    //map Dto to entity
    Phone mapToEntity(PhoneDto dto);
    //map entities to Dtos
    List<PhoneDto> mapToDtos(List<Phone> entities);
    //map Dtos To entities
    List<Phone> mapToEntities(List<PhoneDto> dtos);
}
