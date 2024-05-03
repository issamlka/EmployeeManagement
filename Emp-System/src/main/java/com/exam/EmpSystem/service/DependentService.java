package com.exam.EmpSystem.service;

import com.exam.EmpSystem.dto.DependentDto;
import com.exam.EmpSystem.entity.Dependent;
import com.exam.EmpSystem.mapp.DependentMapper;
import com.exam.EmpSystem.repository.DependentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DependentService {

    @Autowired
    private  DependentRepo dependentRepo;
    @Autowired
    private DependentMapper dependentMapper ;

    public List<DependentDto> getAllDependents() {
        List<Dependent> dependents = dependentRepo.findAll();
        return dependentMapper.mapToDtos(dependents);
    }

    public DependentDto getDependentById(Integer id) {
        Optional<Dependent> dependent = dependentRepo.findById(id);
        return dependent.map(dependentMapper::mapToDto).orElse(null);
    }

    public DependentDto createDependent(DependentDto dependentDto) {
        Dependent dependent = dependentMapper.mapToEntity(dependentDto);
        Dependent savedDependent = dependentRepo.save(dependent);
        return dependentMapper.mapToDto(savedDependent);
    }

    public DependentDto updateDependent(Integer id, DependentDto dependentDto) {
        if (dependentRepo.existsById(id)) {
            Dependent dependent = dependentMapper.mapToEntity(dependentDto);
            dependent.setId(id);
            Dependent updatedDependent = dependentRepo.save(dependent);
            return dependentMapper.mapToDto(updatedDependent);
        } else {
            throw new IllegalArgumentException("Dependent with id " + id + " not found.");
        }
    }

    public void deleteDependent(Integer id) {
        dependentRepo.deleteById(id);
    }
}
