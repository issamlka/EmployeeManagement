package com.exam.EmpSystem.repository;

import com.exam.EmpSystem.entity.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentRepo extends JpaRepository <Dependent, Integer> {
}
