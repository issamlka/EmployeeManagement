package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.AddressDto;
import com.exam.EmpSystem.entity.Address;
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
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressDto mapToDto(Address entity) {
        if ( entity == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        return addressDto;
    }

    @Override
    public Address mapToEntity(AddressDto dto) {
        if ( dto == null ) {
            return null;
        }

        Address address = new Address();

        return address;
    }

    @Override
    public List<AddressDto> mapToDtos(List<Address> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AddressDto> list = new ArrayList<AddressDto>( entities.size() );
        for ( Address address : entities ) {
            list.add( mapToDto( address ) );
        }

        return list;
    }

    @Override
    public List<Address> mapToEntities(List<AddressDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( dtos.size() );
        for ( AddressDto addressDto : dtos ) {
            list.add( mapToEntity( addressDto ) );
        }

        return list;
    }
}
