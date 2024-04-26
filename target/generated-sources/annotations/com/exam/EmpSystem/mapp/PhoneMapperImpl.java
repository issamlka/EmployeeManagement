package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.PhoneDto;
import com.exam.EmpSystem.entity.Phone;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T20:04:09+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class PhoneMapperImpl implements PhoneMapper {

    @Override
    public PhoneDto mapToDto(Phone entity) {
        if ( entity == null ) {
            return null;
        }

        PhoneDto phoneDto = new PhoneDto();

        return phoneDto;
    }

    @Override
    public Phone mapToEntity(PhoneDto dto) {
        if ( dto == null ) {
            return null;
        }

        Phone phone = new Phone();

        return phone;
    }

    @Override
    public List<PhoneDto> mapToDtos(List<Phone> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PhoneDto> list = new ArrayList<PhoneDto>( entities.size() );
        for ( Phone phone : entities ) {
            list.add( mapToDto( phone ) );
        }

        return list;
    }

    @Override
    public List<Phone> mapToEntities(List<PhoneDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Phone> list = new ArrayList<Phone>( dtos.size() );
        for ( PhoneDto phoneDto : dtos ) {
            list.add( mapToEntity( phoneDto ) );
        }

        return list;
    }
}
