package com.nicoletti.dslist.services;

import com.nicoletti.dslist.dtos.GameMinDTO;
import com.nicoletti.dslist.entities.GameEntity;
import com.nicoletti.dslist.repositories.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<GameEntity> result = gameRepository.findAll();
        return result.stream().map(
                        x -> new GameMinDTO(x.getTitle(), x.getYear(), x.getImgUrl(), x.getShortDescription()))
                .toList();
    }

}
