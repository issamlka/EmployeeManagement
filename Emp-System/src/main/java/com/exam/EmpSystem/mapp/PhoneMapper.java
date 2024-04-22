package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.PhoneDto;
import com.exam.EmpSystem.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

    @Mapping(target = "id", ignore = true) // Ignore id mapping as it's auto-generated
    PhoneDto phoneToPhoneDto(Phone phone);

    Phone phoneDtoToPhone(PhoneDto phoneDto);

}
