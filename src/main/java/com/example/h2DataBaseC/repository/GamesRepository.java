package com.example.h2DataBaseC.repository;

import com.example.h2DataBaseC.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Game, Long> {
    //jpa gera automaticamente
    // save (), findAll(), findByID
    //deleteByid()


}
