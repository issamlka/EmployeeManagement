package com.exam.EmpSystem.controller;

import com.exam.EmpSystem.dto.PhoneDto;
import com.exam.EmpSystem.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phones")
public class PhoneController {

    private final PhoneService phoneService;

    @Autowired
    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping
    public ResponseEntity<List<PhoneDto>> getAllPhones() {
        List<PhoneDto> phones = phoneService.getAllPhones();
        return ResponseEntity.ok(phones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhoneDto> getPhoneById(@PathVariable Integer id) {
        PhoneDto phone = phoneService.getPhoneById(id);
        if (phone != null) {
            return ResponseEntity.ok(phone);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PhoneDto> createPhone(@RequestBody PhoneDto phoneDto) {
        PhoneDto newPhone = phoneService.createPhone(phoneDto);
        return ResponseEntity.status(201).body(newPhone);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PhoneDto> updatePhone(
            @PathVariable Integer id,
            @RequestBody PhoneDto phoneDto
    ) {
        try {
            PhoneDto updatedPhone = phoneService.updatePhone(id, phoneDto);
            return ResponseEntity.ok(updatedPhone);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePhone(@PathVariable Integer id) {
        try {
            phoneService.deletePhone(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
