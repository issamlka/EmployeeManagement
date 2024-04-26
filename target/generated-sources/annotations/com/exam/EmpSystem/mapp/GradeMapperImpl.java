package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.GradeDto;
import com.exam.EmpSystem.entity.Grade;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T20:04:08+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class GradeMapperImpl implements GradeMapper {

    @Override
    public GradeDto mapToDto(Grade entity) {
        if ( entity == null ) {
            return null;
        }

        GradeDto gradeDto = new GradeDto();

        return gradeDto;
    }

    @Override
    public Grade mapToEntity(GradeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Grade grade = new Grade();

        return grade;
    }

    @Override
    public List<GradeDto> mapToDtos(List<Grade> entities) {
        if ( entities == null ) {
            return null;
        }

        List<GradeDto> list = new ArrayList<GradeDto>( entities.size() );
        for ( Grade grade : entities ) {
            list.add( mapToDto( grade ) );
        }

        return list;
    }

    @Override
    public List<Grade> mapToEntities(List<GradeDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Grade> list = new ArrayList<Grade>( dtos.size() );
        for ( GradeDto gradeDto : dtos ) {
            list.add( mapToEntity( gradeDto ) );
        }

        return list;
    }
}
