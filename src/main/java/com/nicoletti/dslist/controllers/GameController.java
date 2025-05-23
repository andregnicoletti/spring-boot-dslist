package com.nicoletti.dslist.controllers;

import com.nicoletti.dslist.model.dtos.GameDTO;
import com.nicoletti.dslist.model.dtos.GameMinDTO;
import com.nicoletti.dslist.services.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> findById(@PathVariable Long id) throws Exception {
        GameDTO result = gameService.findById(id);
        return ResponseEntity.ok(result);
    }

}
