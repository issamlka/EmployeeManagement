package com.exam.EmpSystem.repository;

import com.exam.EmpSystem.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DesignationRepo extends JpaRepository<Designation, Integer> {
}
