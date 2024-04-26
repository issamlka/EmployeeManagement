package com.exam.EmpSystem.base;

import java.util.List;

public interface BaseMapper<Entity,Dto> {

    //map entity to Dto
    Dto mapToDto(Entity entity);
    //map Dto to entity
    Entity mapToEntity(Dto dto);
    //map entities to Dtos
    List<Dto> mapToDtos(List<Entity> entities);
    //map Dtos To entities
    List<Entity> mapToEntities(List<Dto> dtos);

}
