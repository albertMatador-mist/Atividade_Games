package com.example.h2DataBaseC.controller;

import com.example.h2DataBaseC.model.Game;
import com.example.h2DataBaseC.service.GamesService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Game")
@RequiredArgsConstructor

public class GamesController {

    private final GamesService service;

    static class GamesControllerService {
        
    };

    //get /pessoas (listar todos)

    public List<Game>Listar(){
        return service.listar();
    }

    @GetMapping
    public List<Game> listar(){
        return service.listar();
    }



    //get /pessoa/(id) (busca por id)
    @GetMapping("/{id}")
    public ResponseEntity<Game> buscar(@PathVariable Long id){
        return ResponseEntity .ok(service.buscarPorId(id));
    }


    //post /pessoa
    @PostMapping
    public ResponseEntity<Game> salvar(@RequestBody Game Game){
        return ResponseEntity .ok(service.salvar(Game));
    }

//put /pessoas/ {id} atualizar

    public ResponseEntity<Game> atualizar(@PathVariable Long id,
                                          @RequestBody Game dados) {

        return ResponseEntity.ok(service.atualizar(id, dados));

    }
    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> excluir (@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }



}










