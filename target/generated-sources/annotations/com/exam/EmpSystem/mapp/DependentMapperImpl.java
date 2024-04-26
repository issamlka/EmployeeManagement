package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.DependentDto;
import com.exam.EmpSystem.entity.Dependent;
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
public class DependentMapperImpl implements DependentMapper {

    @Override
    public DependentDto mapToDto(Dependent entity) {
        if ( entity == null ) {
            return null;
        }

        DependentDto dependentDto = new DependentDto();

        return dependentDto;
    }

    @Override
    public Dependent mapToEntity(DependentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Dependent dependent = new Dependent();

        return dependent;
    }

    @Override
    public List<DependentDto> mapToDtos(List<Dependent> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DependentDto> list = new ArrayList<DependentDto>( entities.size() );
        for ( Dependent dependent : entities ) {
            list.add( mapToDto( dependent ) );
        }

        return list;
    }

    @Override
    public List<Dependent> mapToEntities(List<DependentDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Dependent> list = new ArrayList<Dependent>( dtos.size() );
        for ( DependentDto dependentDto : dtos ) {
            list.add( mapToEntity( dependentDto ) );
        }

        return list;
    }
}
