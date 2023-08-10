/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppokemon;

/**
 *
 * @author EQUIPO
 */
public abstract class Pokemon {
    
    //Atributos
    int num_pokedex;
    String nombrePokemon;
    Double pesoPokemon;
    char sexo;
    int temporadaQueAparece;
    String tipo;
    
    //Constructores
    public Pokemon() {
    }
    public Pokemon(int num_pokedex, String nombrePokemon, Double pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }
    
    
    
    //Metodos Comunes sin implementacion
    
    public abstract String atacarPlacaje();
    
    public abstract String atacarArañazo();
    
    public abstract String atacarMordisco();
   
}
