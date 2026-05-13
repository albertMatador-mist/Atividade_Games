package com.example.h2DataBaseC.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Games")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String NickName;
    private String email;
    private int Nivel;
    //lombok gera tudo automaticamente
    //getId. getnome.getidade
    //getid,setnome,setidade


}
