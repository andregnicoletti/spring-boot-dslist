package com.nicoletti.dslist.model.mappers;

import com.nicoletti.dslist.model.projections.GameMinProjection;
import com.nicoletti.dslist.model.dtos.GameDTO;
import com.nicoletti.dslist.model.dtos.GameMinDTO;
import com.nicoletti.dslist.model.entities.GameEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GameMapping {

    GameEntity dtoMinToEntity(GameMinDTO dto);

    GameMinDTO toDtoMin(GameEntity entity);

    GameDTO toDto(GameEntity entity);

    @Mapping(source = "gameYear", target = "year")
    GameMinDTO projectionToDtoMin(GameMinProjection projection);

    // Atualização: aplica dados do DTO em uma entidade existente
    void updateGameFromMinDto(GameMinDTO dto, @MappingTarget GameEntity entity);

}
