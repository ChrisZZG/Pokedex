/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppokemon;

/**
 *
 * @author EQUIPO
 */
public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    public Squirtle(int num_pokedex, String nombrePokemon, Double pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }
    
    

    @Override
    public String atacarPlacaje() {
        return "Soy Squirtle y estoy atacando con Placaje";
    }

    @Override
    public String atacarArañazo() {
        return "Soy Squirtle y estoy atacando con Arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Squirtle y estoy atacando con Mordisco";
    }

    @Override
    public String atacarHidrobomba() {
        return "Soy Squirtle y estoy atacando con Hidrobomba";
    }

    @Override
    public String atacarPistolaAgua() {
        return "Soy Squirtle y estoy atacando con Pistola Agua";
    }

    @Override
    public String atacarBurbuja() {
        return "Soy Squirtle y estoy atacando con Burbuja";
    }

    @Override
    public String atacarHidropulso() {
        return "Soy Squirtle y estoy atacando con Hidropulso";
    }
    
}
