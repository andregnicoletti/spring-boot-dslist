package com.nicoletti.dslist.repositories;

import com.nicoletti.dslist.model.entities.GameListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameListEntity, Long> {
}
