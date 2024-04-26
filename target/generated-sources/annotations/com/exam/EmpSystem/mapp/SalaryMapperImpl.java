package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.SalaryDto;
import com.exam.EmpSystem.entity.Salary;
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
public class SalaryMapperImpl implements SalaryMapper {

    @Override
    public SalaryDto mapToDto(Salary entity) {
        if ( entity == null ) {
            return null;
        }

        SalaryDto salaryDto = new SalaryDto();

        return salaryDto;
    }

    @Override
    public Salary mapToEntity(SalaryDto dto) {
        if ( dto == null ) {
            return null;
        }

        Salary salary = new Salary();

        return salary;
    }

    @Override
    public List<SalaryDto> mapToDtos(List<Salary> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SalaryDto> list = new ArrayList<SalaryDto>( entities.size() );
        for ( Salary salary : entities ) {
            list.add( mapToDto( salary ) );
        }

        return list;
    }

    @Override
    public List<Salary> mapToEntities(List<SalaryDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Salary> list = new ArrayList<Salary>( dtos.size() );
        for ( SalaryDto salaryDto : dtos ) {
            list.add( mapToEntity( salaryDto ) );
        }

        return list;
    }
}
