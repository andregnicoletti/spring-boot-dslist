package com.nicoletti.dslist.services;

import com.nicoletti.dslist.model.dtos.GameListDTO;
import com.nicoletti.dslist.model.entities.GameListEntity;
import com.nicoletti.dslist.model.mappers.GameListMapping;
import com.nicoletti.dslist.repositories.GameListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class GameListService {

    private final GameListRepository gameListRepository;

    private final GameListMapping gameListMapping;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameListEntity> result = gameListRepository.findAll();
        return result.stream().map(gameListMapping::toDto).toList();
    }

}
