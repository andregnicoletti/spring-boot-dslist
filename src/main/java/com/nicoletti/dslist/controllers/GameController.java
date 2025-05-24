package com.nicoletti.dslist.controllers;

import com.nicoletti.dslist.model.dtos.GameDTO;
import com.nicoletti.dslist.model.dtos.GameMinDTO;
import com.nicoletti.dslist.model.dtos.ReplacementDTO;
import com.nicoletti.dslist.services.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/list/{id}")
    public ResponseEntity<List<GameMinDTO>> findByListId(@PathVariable Long id) throws Exception {
        List<GameMinDTO> result = gameService.findByList(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/list/{id}/replacement")
    public ResponseEntity<List<GameMinDTO>> move(@PathVariable Long id, @RequestBody ReplacementDTO dto) throws Exception {
        List<GameMinDTO> result = gameService.move(id, dto.sourceIndex(), dto.destinationIndex());
        return ResponseEntity.ok(result);
    }

}
