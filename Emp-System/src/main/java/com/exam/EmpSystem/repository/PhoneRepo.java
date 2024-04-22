package com.exam.EmpSystem.repository;


import com.exam.EmpSystem.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepo extends JpaRepository <Phone, Integer> {

}
