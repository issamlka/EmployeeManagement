package com.exam.EmpSystem.service;

import com.exam.EmpSystem.dto.EmployeeDto;
import com.exam.EmpSystem.entity.Employee;
import com.exam.EmpSystem.mapp.EmployeeMapper;
import com.exam.EmpSystem.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<EmployeeDto> findAll() {
        List<Employee> employees = employeeRepo.findAll();
        return employeeMapper.mapToDtos(employees);
    }

    public Optional<EmployeeDto> findById(Integer id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        return employee.map(employeeMapper::mapToDto);
    }

    public EmployeeDto save(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.mapToEntity(employeeDto);
        Employee savedEmployee = employeeRepo.save(employee);
        return employeeMapper.mapToDto(savedEmployee);
    }

    public EmployeeDto update(Integer id, EmployeeDto newEmployeeDto) {
        Optional<Employee> existingEmployeeOptional = employeeRepo.findById(id);
        if (existingEmployeeOptional.isPresent()) {
            Employee existingEmployee = existingEmployeeOptional.get();
            Employee newEmployee = employeeMapper.mapToEntity(newEmployeeDto);
            existingEmployee.setFirstName(newEmployee.getFirstName());
            existingEmployee.setLastName(newEmployee.getLastName());
            existingEmployee.setEmail(newEmployee.getEmail());
            existingEmployee.setSalary(newEmployee.getSalary());
            existingEmployee.setAddress(newEmployee.getAddress());
            existingEmployee.setPhone(newEmployee.getPhone());
            existingEmployee.setManager(newEmployee.getManager());
            // Add other fields to update
            Employee updatedEmployee = employeeRepo.save(existingEmployee);
            return employeeMapper.mapToDto(updatedEmployee);
        }
        return null; // or throw an exception indicating employee not found
    }

    public void delete(Integer id) {
        employeeRepo.deleteById(id);
    }
}
