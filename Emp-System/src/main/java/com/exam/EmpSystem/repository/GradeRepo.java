package com.exam.EmpSystem.repository;

import com.exam.EmpSystem.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepo extends JpaRepository <Grade, Integer> {
}
