package com.exam.EmpSystem.mapp;


import com.exam.EmpSystem.dto.PromotionDto;
import com.exam.EmpSystem.entity.Promotion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PromotionMapper {

    PromotionMapper INSTANCE = Mappers.getMapper(PromotionMapper.class);

    @Mapping(source = "employee", target = "employee")
    @Mapping(source = "grade", target = "grade")
    @Mapping(source = "datePromotion", target = "datePromotion")
    @Mapping(source = "salary", target = "salary")
    PromotionDto promotionToPromotionDto(Promotion promotion);

    @Mapping(source = "employee", target = "employee")
    @Mapping(source = "grade", target = "grade")
    @Mapping(source = "datePromotion", target = "datePromotion")
    @Mapping(source = "salary", target = "salary")
    Promotion promotionDtoToPromotion(PromotionDto promotionDto);

    void updatePromotionFromDto(PromotionDto promotionDto, @MappingTarget Promotion promotion);



}
