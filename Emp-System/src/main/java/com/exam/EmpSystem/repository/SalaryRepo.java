package com.exam.EmpSystem.repository;

import com.exam.EmpSystem.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepo extends JpaRepository<Salary, Integer> {

}
