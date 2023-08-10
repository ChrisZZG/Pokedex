/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppokemon;

/**
 *
 * @author EQUIPO
 */
public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    public Charmander(int num_pokedex, String nombrePokemon, Double pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }
    
    

    @Override
    public String atacarPlacaje() {
        return "Soy Charmander y estoy atacando con Placaje";
    }

    @Override
    public String atacarArañazo() {
       return "soy Charmander y estoy atacando con Arañazo";
    }

    @Override
    public String atacarMordisco() {
       return "Soy Charmander y estoy atacando con Mordisco";
    }

    @Override
    public String atacarPunioFuego() {
        return "Soy Charmander y estoy atacando con Puño Fuego";
    }

    @Override
    public String atacarAscuas() {
        return "Soy Charmander y estoy atacando con Ascuas";
    }

    @Override
    public String atacarLanzallamas() {
        return "Soy Charmander y estoy atacando con Lanzallamas";
    }
    
}
