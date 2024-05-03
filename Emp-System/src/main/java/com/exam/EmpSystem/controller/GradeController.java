package com.exam.EmpSystem.controller;

import com.exam.EmpSystem.dto.GradeDto;
import com.exam.EmpSystem.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {

    private final GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping
    public ResponseEntity<List<GradeDto>> getAllGrades() {
        List<GradeDto> grades = gradeService.getAllGrades();
        return ResponseEntity.ok(grades);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GradeDto> getGradeById(@PathVariable Integer id) {
        GradeDto grade = gradeService.getGradeById(id);
        if (grade != null) {
            return ResponseEntity.ok(grade);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<GradeDto> createGrade(@RequestBody GradeDto gradeDto) {
        GradeDto newGrade = gradeService.createGrade(gradeDto);
        return ResponseEntity.status(201).body(newGrade);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GradeDto> updateGrade(
            @PathVariable Integer id,
            @RequestBody GradeDto gradeDto
    ) {
        try {
            GradeDto updatedGrade = gradeService.updateGrade(id, gradeDto);
            return ResponseEntity.ok(updatedGrade);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrade(@PathVariable Integer id) {
        try {
            gradeService.deleteGrade(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
