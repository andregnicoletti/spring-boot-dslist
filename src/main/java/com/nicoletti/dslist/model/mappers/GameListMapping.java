package com.nicoletti.dslist.model.mappers;

import com.nicoletti.dslist.model.dtos.GameListDTO;
import com.nicoletti.dslist.model.entities.GameListEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GameListMapping {

    GameListEntity dtoToEntity(GameListDTO dto);

    GameListDTO toDto(GameListEntity GameListEntity);

    void updateGameFromDto(GameListDTO dto, @MappingTarget GameListEntity entity);

}
