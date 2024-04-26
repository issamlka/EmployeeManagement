package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.DesignationDto;
import com.exam.EmpSystem.entity.Designation;
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
public class DesignationMapperImpl implements DesignationMapper {

    @Override
    public DesignationDto mapToDto(Designation entity) {
        if ( entity == null ) {
            return null;
        }

        DesignationDto designationDto = new DesignationDto();

        return designationDto;
    }

    @Override
    public Designation mapToEntity(DesignationDto dto) {
        if ( dto == null ) {
            return null;
        }

        Designation designation = new Designation();

        return designation;
    }

    @Override
    public List<DesignationDto> mapToDtos(List<Designation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DesignationDto> list = new ArrayList<DesignationDto>( entities.size() );
        for ( Designation designation : entities ) {
            list.add( mapToDto( designation ) );
        }

        return list;
    }

    @Override
    public List<Designation> mapToEntities(List<DesignationDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Designation> list = new ArrayList<Designation>( dtos.size() );
        for ( DesignationDto designationDto : dtos ) {
            list.add( mapToEntity( designationDto ) );
        }

        return list;
    }
}
