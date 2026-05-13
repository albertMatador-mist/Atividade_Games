package com.example.h2DataBaseC.service;

import com.example.h2DataBaseC.model.Game;
import com.example.h2DataBaseC.repository.GamesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class GamesService {

    private final GamesRepository repository;

    //read
    public List<Game> listar(){
        return repository.findAll();

    }

    //READ BUSCAR POR ID

    public Game buscarPorId(Long id){

        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException( "pessoa nao encontrada"));
    }

    //create
    public Game salvar(Game Game){
        return repository.save(Game);

    }
    //update
    public Game atualizar(Long id, Game dados){
        Game games = buscarPorId(id);
        games.setNickName(dados.getNickName());
        games.setEmail(dados.getEmail());
        games.setNivel(dados.getNivel());
        return repository.save(games);
    }


    public void excluir(Long id) {
        repository.deleteById(id);
    }




}
