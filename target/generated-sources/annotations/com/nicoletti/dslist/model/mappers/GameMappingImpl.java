package com.nicoletti.dslist.model.mappers;

import com.nicoletti.dslist.model.dtos.GameDTO;
import com.nicoletti.dslist.model.dtos.GameMinDTO;
import com.nicoletti.dslist.model.entities.GameEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-23T14:25:33-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class GameMappingImpl implements GameMapping {

    @Override
    public GameEntity dtoMinToEntity(GameMinDTO dto) {
        if ( dto == null ) {
            return null;
        }

        GameEntity gameEntity = new GameEntity();

        gameEntity.setTitle( dto.title() );
        gameEntity.setYear( dto.year() );
        gameEntity.setImgUrl( dto.imgUrl() );
        gameEntity.setShortDescription( dto.shortDescription() );

        return gameEntity;
    }

    @Override
    public GameMinDTO toDtoMin(GameEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String title = null;
        String year = null;
        String imgUrl = null;
        String shortDescription = null;

        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();

        GameMinDTO gameMinDTO = new GameMinDTO( title, year, imgUrl, shortDescription );

        return gameMinDTO;
    }

    @Override
    public GameDTO toDto(GameEntity entity) {
        if ( entity == null ) {
            return null;
        }

        GameDTO gameDTO = new GameDTO();

        gameDTO.setId( entity.getId() );
        gameDTO.setTitle( entity.getTitle() );
        gameDTO.setYear( entity.getYear() );
        gameDTO.setGenre( entity.getGenre() );
        gameDTO.setPlatforms( entity.getPlatforms() );
        gameDTO.setScore( entity.getScore() );
        gameDTO.setImgUrl( entity.getImgUrl() );
        gameDTO.setShortDescription( entity.getShortDescription() );
        gameDTO.setLongDescription( entity.getLongDescription() );

        return gameDTO;
    }

    @Override
    public void updateGameFromMinDto(GameMinDTO dto, GameEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setTitle( dto.title() );
        entity.setYear( dto.year() );
        entity.setImgUrl( dto.imgUrl() );
        entity.setShortDescription( dto.shortDescription() );
    }
}
