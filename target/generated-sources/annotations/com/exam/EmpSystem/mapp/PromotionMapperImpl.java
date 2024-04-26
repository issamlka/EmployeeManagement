package com.exam.EmpSystem.mapp;

import com.exam.EmpSystem.dto.PromotionDto;
import com.exam.EmpSystem.entity.Promotion;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T20:04:09+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class PromotionMapperImpl implements PromotionMapper {

    @Override
    public PromotionDto mapToDto(Promotion entity) {
        if ( entity == null ) {
            return null;
        }

        PromotionDto promotionDto = new PromotionDto();

        return promotionDto;
    }

    @Override
    public Promotion mapToEntity(PromotionDto dto) {
        if ( dto == null ) {
            return null;
        }

        Promotion promotion = new Promotion();

        return promotion;
    }

    @Override
    public List<PromotionDto> mapToDtos(List<Promotion> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PromotionDto> list = new ArrayList<PromotionDto>( entities.size() );
        for ( Promotion promotion : entities ) {
            list.add( mapToDto( promotion ) );
        }

        return list;
    }

    @Override
    public List<Promotion> mapToEntities(List<PromotionDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Promotion> list = new ArrayList<Promotion>( dtos.size() );
        for ( PromotionDto promotionDto : dtos ) {
            list.add( mapToEntity( promotionDto ) );
        }

        return list;
    }
}
