package com.exam.EmpSystem.service;

import com.exam.EmpSystem.dto.DesignationDto;
import com.exam.EmpSystem.entity.Designation;
import com.exam.EmpSystem.mapp.DesignationMapper;
import com.exam.EmpSystem.repository.DesignationRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesignationService {

    private final DesignationRepo designationRepo;
    private final DesignationMapper designationMapper;

    @Autowired
    public DesignationService(DesignationRepo designationRepo, DesignationMapper designationMapper) {
        this.designationRepo = designationRepo;
        this.designationMapper = designationMapper;
    }

    public List<DesignationDto> getAllDesignations() {
        List<Designation> designations = designationRepo.findAll();
        return designationMapper.mapToDtos(designations);
    }

    public DesignationDto getDesignationById(Integer id) {
        Optional<Designation> designation = designationRepo.findById(id);
        return designation.map(designationMapper::mapToDto).orElse(null);
    }

    public DesignationDto createDesignation(DesignationDto designationDto) {
        Designation designation = designationMapper.mapToEntity(designationDto);
        Designation savedDesignation = designationRepo.save(designation);
        return designationMapper.mapToDto(savedDesignation);
    }

    public DesignationDto updateDesignation(Integer id, DesignationDto designationDto) {
        if (designationRepo.existsById(id)) {
            Designation designation = designationMapper.mapToEntity(designationDto);
            designation.setId(id);
            Designation updatedDesignation = designationRepo.save(designation);
            return designationMapper.mapToDto(updatedDesignation);
        } else {
            throw new IllegalArgumentException("Designation with id " + id + " not found.");
        }
    }

    public void deleteDesignation(Integer id) {
        designationRepo.deleteById(id);
    }
}
