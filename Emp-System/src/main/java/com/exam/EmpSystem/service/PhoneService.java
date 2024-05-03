package com.exam.EmpSystem.service;

import com.exam.EmpSystem.dto.PhoneDto;
import com.exam.EmpSystem.entity.Phone;
import com.exam.EmpSystem.repository.PhoneRepo;
import com.exam.EmpSystem.mapp.PhoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneService {

    private final PhoneRepo phoneRepo;
    private final PhoneMapper phoneMapper;

    @Autowired
    public PhoneService(PhoneRepo phoneRepo, PhoneMapper phoneMapper) {
        this.phoneRepo = phoneRepo;
        this.phoneMapper = phoneMapper;
    }

    public List<PhoneDto> getAllPhones() {
        List<Phone> phones = phoneRepo.findAll();
        return phoneMapper.mapToDtos(phones);
    }

    public PhoneDto getPhoneById(Integer id) {
        Optional<Phone> phone = phoneRepo.findById(id);
        return phone.map(phoneMapper::mapToDto).orElse(null);
    }

    public PhoneDto createPhone(PhoneDto phoneDto) {
        Phone phone = phoneMapper.mapToEntity(phoneDto);
        Phone savedPhone = phoneRepo.save(phone);
        return phoneMapper.mapToDto(savedPhone);
    }

    public PhoneDto updatePhone(Integer id, PhoneDto phoneDto) {
        if (phoneRepo.existsById(id)) {
            Phone phone = phoneMapper.mapToEntity(phoneDto);
            phone.setId(id);
            Phone updatedPhone = phoneRepo.save(phone);
            return phoneMapper.mapToDto(updatedPhone);
        } else {
            throw new IllegalArgumentException("Phone with id " + id + " not found.");
        }
    }

    public void deletePhone(Integer id) {
        phoneRepo.deleteById(id);
    }
}
