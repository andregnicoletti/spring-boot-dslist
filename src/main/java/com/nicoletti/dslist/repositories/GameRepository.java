package com.nicoletti.dslist.repositories;

import com.nicoletti.dslist.model.projections.GameMinProjection;
import com.nicoletti.dslist.model.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<GameEntity, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_game.id, tb_game.title, tb_game.game_year AS gameYear, tb_game.img_url AS imgUrl,
            tb_game.short_description AS shortDescription, tb_belonging.position
            FROM tb_game
            INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
            WHERE tb_belonging.list_id = :listId
            ORDER BY tb_belonging.position
            """)
    List<GameMinProjection> searchByList(Long listId);

    @Modifying
    @Query(
            nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId"
    )
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}
