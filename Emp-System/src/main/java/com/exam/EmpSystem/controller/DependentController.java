package com.exam.EmpSystem.controller;

import com.exam.EmpSystem.dto.DependentDto;
import com.exam.EmpSystem.service.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dependents")
public class DependentController {

    private final DependentService dependentService;

    @Autowired
    public DependentController(DependentService dependentService) {
        this.dependentService = dependentService;
    }

    @GetMapping
    public ResponseEntity<List<DependentDto>> getAllDependents() {
        List<DependentDto> dependents = dependentService.getAllDependents();
        return ResponseEntity.ok(dependents);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DependentDto> getDependentById(@PathVariable Integer id) {
        DependentDto dependent = dependentService.getDependentById(id);
        if (dependent != null) {
            return ResponseEntity.ok(dependent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<DependentDto> createDependent(@RequestBody DependentDto dependentDto) {
        DependentDto newDependent = dependentService.createDependent(dependentDto);
        return ResponseEntity.status(201).body(newDependent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DependentDto> updateDependent(
            @PathVariable Integer id,
            @RequestBody DependentDto dependentDto
    ) {
        try {
            DependentDto updatedDependent = dependentService.updateDependent(id, dependentDto);
            return ResponseEntity.ok(updatedDependent);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDependent(@PathVariable Integer id) {
        try {
            dependentService.deleteDependent(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
