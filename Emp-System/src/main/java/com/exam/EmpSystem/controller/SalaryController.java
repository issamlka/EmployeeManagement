package com.exam.EmpSystem.controller;

import com.exam.EmpSystem.dto.SalaryDto;
import com.exam.EmpSystem.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salaries")
public class SalaryController {

    private final SalaryService salaryService;

    @Autowired
    public SalaryController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @GetMapping
    public ResponseEntity<List<SalaryDto>> getAllSalaries() {
        List<SalaryDto> salaries = salaryService.getAllSalaries();
        return ResponseEntity.ok(salaries);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalaryDto> getSalaryById(@PathVariable Integer id) {
        SalaryDto salary = salaryService.getSalaryById(id);
        if (salary != null) {
            return ResponseEntity.ok(salary);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<SalaryDto> createSalary(@RequestBody SalaryDto salaryDto) {
        SalaryDto newSalary = salaryService.createSalary(salaryDto);
        return ResponseEntity.status(201).body(newSalary);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalaryDto> updateSalary(
            @PathVariable Integer id,
            @RequestBody SalaryDto salaryDto
    ) {
        try {
            SalaryDto updatedSalary = salaryService.updateSalary(id, salaryDto);
            return ResponseEntity.ok(updatedSalary);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalary(@PathVariable Integer id) {
        try {
            salaryService.deleteSalary(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
