package com.exam.EmpSystem.service;

import com.exam.EmpSystem.dto.PromotionDto;
import com.exam.EmpSystem.entity.Promotion;
import com.exam.EmpSystem.repository.PromotionRepo;
import com.exam.EmpSystem.mapp.PromotionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionService {

    private final PromotionRepo promotionRepo;
    private final PromotionMapper promotionMapper;

    @Autowired
    public PromotionService(PromotionRepo promotionRepo, PromotionMapper promotionMapper) {
        this.promotionRepo = promotionRepo;
        this.promotionMapper = promotionMapper;
    }

    public List<PromotionDto> getAllPromotions() {
        List<Promotion> promotions = promotionRepo.findAll();
        return promotionMapper.mapToDtos(promotions);
    }

    public PromotionDto getPromotionById(Integer id) {
        Optional<Promotion> promotion = promotionRepo.findById(id);
        return promotion.map(promotionMapper::mapToDto).orElse(null);
    }

    public PromotionDto createPromotion(PromotionDto promotionDto) {
        Promotion promotion = promotionMapper.mapToEntity(promotionDto);
        Promotion savedPromotion = promotionRepo.save(promotion);
        return promotionMapper.mapToDto(savedPromotion);
    }

    public PromotionDto updatePromotion(Integer id, PromotionDto promotionDto) {
        if (promotionRepo.existsById(id)) {
            Promotion promotion = promotionMapper.mapToEntity(promotionDto);
            promotion.setId(id);
            Promotion updatedPromotion = promotionRepo.save(promotion);
            return promotionMapper.mapToDto(updatedPromotion);
        } else {
            throw new IllegalArgumentException("Promotion with id " + id + " not found.");
        }
    }

    public void deletePromotion(Integer id) {
        promotionRepo.deleteById(id);
    }
}
