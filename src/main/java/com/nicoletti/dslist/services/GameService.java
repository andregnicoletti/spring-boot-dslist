package com.nicoletti.dslist.services;

import com.nicoletti.dslist.model.projections.GameMinProjection;
import com.nicoletti.dslist.model.dtos.GameDTO;
import com.nicoletti.dslist.model.dtos.GameMinDTO;
import com.nicoletti.dslist.model.entities.GameEntity;
import com.nicoletti.dslist.model.mappers.GameMapping;
import com.nicoletti.dslist.repositories.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    private final GameMapping gameMapping;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<GameEntity> result = gameRepository.findAll();
        return result.stream().map(gameMapping::toDtoMin).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) throws Exception {
        GameEntity entity = gameRepository.findById(id).orElseThrow(() -> new Exception("Id não encontrado"));
        return gameMapping.toDto(entity);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(gameMapping::projectionToDtoMin).toList();
    }

    @Transactional
    public List<GameMinDTO> move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection source = list.remove(sourceIndex);
        list.add(destinationIndex, source);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

        return this.findByList(listId);
    }
}
