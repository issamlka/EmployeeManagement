package com.exam.EmpSystem.service;

import com.exam.EmpSystem.dto.SalaryDto;
import com.exam.EmpSystem.entity.Salary;
import com.exam.EmpSystem.repository.SalaryRepo;
import com.exam.EmpSystem.mapp.SalaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryService {

    private final SalaryRepo salaryRepo;
    private final SalaryMapper salaryMapper;

    @Autowired
    public SalaryService(SalaryRepo salaryRepo, SalaryMapper salaryMapper) {
        this.salaryRepo = salaryRepo;
        this.salaryMapper = salaryMapper;
    }

    public List<SalaryDto> getAllSalaries() {
        List<Salary> salaries = salaryRepo.findAll();
        return salaryMapper.mapToDtos(salaries);
    }

    public SalaryDto getSalaryById(Integer id) {
        Optional<Salary> salary = salaryRepo.findById(id);
        return salary.map(salaryMapper::mapToDto).orElse(null);
    }

    public SalaryDto createSalary(SalaryDto salaryDto) {
        Salary salary = salaryMapper.mapToEntity(salaryDto);
        Salary savedSalary = salaryRepo.save(salary);
        return salaryMapper.mapToDto(savedSalary);
    }

    public SalaryDto updateSalary(Integer id, SalaryDto salaryDto) {
        if (salaryRepo.existsById(id)) {
            Salary salary = salaryMapper.mapToEntity(salaryDto);
            salary.setId(id);
            Salary updatedSalary = salaryRepo.save(salary);
            return salaryMapper.mapToDto(updatedSalary);
        } else {
            throw new IllegalArgumentException("Salary with id " + id + " not found.");
        }
    }

    public void deleteSalary(Integer id) {
        salaryRepo.deleteById(id);
    }
}
