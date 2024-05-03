package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.AddressDto;
import com.exam.EmpSystem.entity.Address;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper  {
	
    //map entity to Dto
	AddressDto mapToDto(Address entity);
    //map Dto to entity
	Address mapToEntity(AddressDto dto);
    //map entities to Dtos
    List<AddressDto> mapToDtos(List<Address> entities);
    //map Dtos To entities
    List<Address> mapToEntities(List<AddressDto> dtos);
}


