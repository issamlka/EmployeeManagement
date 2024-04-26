package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.base.BaseMapper;
import com.exam.EmpSystem.dto.AddressDto;
import com.exam.EmpSystem.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper extends BaseMapper<Address, AddressDto> {
}
