package com.nicoletti.dslist.model.mappers;

import com.nicoletti.dslist.model.dtos.GameMinDTO;
import com.nicoletti.dslist.model.entities.GameEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GameMapping {

    GameEntity dtoMinToEntity(GameMinDTO dto);

    GameMinDTO toDtoMin(GameEntity entity);

    // Atualização: aplica dados do DTO em uma entidade existente
    void updateGameFromMinDto(GameMinDTO dto, @MappingTarget GameEntity entity);

}
