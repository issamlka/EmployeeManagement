package com.exam.EmpSystem.service;

import com.exam.EmpSystem.dto.AddressDto;
import com.exam.EmpSystem.entity.Address;
import com.exam.EmpSystem.mapp.AddressMapper;
import com.exam.EmpSystem.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo; // Assuming you have AddressRepo

    @Autowired
    private AddressMapper addressMapper; // Assuming you have AddressMapper

    public List<AddressDto> findAll() {
        List<Address> addresses = addressRepo.findAll();
        return addressMapper.mapToDtos(addresses);
    }

    public Optional<AddressDto> findById(Integer id) {
        Optional<Address> address = addressRepo.findById(id);
        return address.map(addressMapper::mapToDto);
    }

    public AddressDto save(AddressDto addressDto) {
        Address address = addressMapper.mapToEntity(addressDto);
        Address savedAddress = addressRepo.save(address);
        return addressMapper.mapToDto(savedAddress);
    }

    public AddressDto update(Integer id, AddressDto newAddressDto) {
        Optional<Address> existingAddressOptional = addressRepo.findById(id);
        if (existingAddressOptional.isPresent()) {
            Address existingAddress = existingAddressOptional.get();
            Address newAddress = addressMapper.mapToEntity(newAddressDto);
            existingAddress.setCity(newAddress.getCity());
            existingAddress.setAddressOne(newAddress.getAddressOne());
            existingAddress.setAddressTwo(newAddress.getAddressTwo());
            // Add other fields to update
            Address updatedAddress = addressRepo.save(existingAddress);
            return addressMapper.mapToDto(updatedAddress);
        }
        return null; // or throw an exception indicating address not found
    }

    public void delete(Integer id) {
        addressRepo.deleteById(id);
    }
}




