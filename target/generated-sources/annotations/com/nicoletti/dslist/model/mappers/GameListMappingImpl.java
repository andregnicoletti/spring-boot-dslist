package com.nicoletti.dslist.model.mappers;

import com.nicoletti.dslist.model.dtos.GameListDTO;
import com.nicoletti.dslist.model.entities.GameListEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-23T20:49:58-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class GameListMappingImpl implements GameListMapping {

    @Override
    public GameListEntity dtoToEntity(GameListDTO dto) {
        if ( dto == null ) {
            return null;
        }

        GameListEntity gameListEntity = new GameListEntity();

        gameListEntity.setId( dto.id() );
        gameListEntity.setName( dto.name() );

        return gameListEntity;
    }

    @Override
    public GameListDTO toDto(GameListEntity GameListEntity) {
        if ( GameListEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;

        id = GameListEntity.getId();
        name = GameListEntity.getName();

        GameListDTO gameListDTO = new GameListDTO( id, name );

        return gameListDTO;
    }

    @Override
    public void updateGameFromDto(GameListDTO dto, GameListEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setId( dto.id() );
        entity.setName( dto.name() );
    }
}
