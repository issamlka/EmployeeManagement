package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.EmployeeDto;
import com.exam.EmpSystem.entity.Employee;
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
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto mapToDto(Employee entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        return employeeDto;
    }

    @Override
    public Employee mapToEntity(EmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        return employee;
    }

    @Override
    public List<EmployeeDto> mapToDtos(List<Employee> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>( entities.size() );
        for ( Employee employee : entities ) {
            list.add( mapToDto( employee ) );
        }

        return list;
    }

    @Override
    public List<Employee> mapToEntities(List<EmployeeDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( dtos.size() );
        for ( EmployeeDto employeeDto : dtos ) {
            list.add( mapToEntity( employeeDto ) );
        }

        return list;
    }
}
