package com.exam.EmpSystem.controller;

import com.exam.EmpSystem.dto.DesignationDto;
import com.exam.EmpSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/designations")
public class DesignationController {

    private final DesignationService designationService;

    @Autowired
    public DesignationController(DesignationService designationService) {
        this.designationService = designationService;
    }

    @GetMapping
    public ResponseEntity<List<DesignationDto>> getAllDesignations() {
        List<DesignationDto> designations = designationService.getAllDesignations();
        return ResponseEntity.ok(designations);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DesignationDto> getDesignationById(@PathVariable Integer id) {
        DesignationDto designation = designationService.getDesignationById(id);
        if (designation != null) {
            return ResponseEntity.ok(designation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<DesignationDto> createDesignation(@RequestBody DesignationDto designationDto) {
        DesignationDto newDesignation = designationService.createDesignation(designationDto);
        return ResponseEntity.status(201).body(newDesignation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DesignationDto> updateDesignation(
            @PathVariable Integer id,
            @RequestBody DesignationDto designationDto
    ) {
        try {
            DesignationDto updatedDesignation = designationService.updateDesignation(id, designationDto);
            return ResponseEntity.ok(updatedDesignation);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDesignation(@PathVariable Integer id) {
        try {
            designationService.deleteDesignation(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
