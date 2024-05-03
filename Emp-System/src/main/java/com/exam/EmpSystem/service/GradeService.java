package com.exam.EmpSystem.service;

import com.exam.EmpSystem.dto.GradeDto;
import com.exam.EmpSystem.entity.Grade;
import com.exam.EmpSystem.mapp.GradeMapper;
import com.exam.EmpSystem.repository.GradeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeService {

    private final GradeRepo gradeRepo;
    private final GradeMapper gradeMapper;

    @Autowired
    public GradeService(GradeRepo gradeRepo, GradeMapper gradeMapper) {
        this.gradeRepo = gradeRepo;
        this.gradeMapper = gradeMapper;
    }

    public List<GradeDto> getAllGrades() {
        List<Grade> grades = gradeRepo.findAll();
        return gradeMapper.mapToDtos(grades);
    }

    public GradeDto getGradeById(Integer id) {
        Optional<Grade> grade = gradeRepo.findById(id);
        return grade.map(gradeMapper::mapToDto).orElse(null);
    }

    public GradeDto createGrade(GradeDto gradeDto) {
        Grade grade = gradeMapper.mapToEntity(gradeDto);
        Grade savedGrade = gradeRepo.save(grade);
        return gradeMapper.mapToDto(savedGrade);
    }

    public GradeDto updateGrade(Integer id, GradeDto gradeDto) {
        if (gradeRepo.existsById(id)) {
            Grade grade = gradeMapper.mapToEntity(gradeDto);
            grade.setId(id);
            Grade updatedGrade = gradeRepo.save(grade);
            return gradeMapper.mapToDto(updatedGrade);
        } else {
            throw new IllegalArgumentException("Grade with id " + id + " not found.");
        }
    }

    public void deleteGrade(Integer id) {
        gradeRepo.deleteById(id);
    }
}
