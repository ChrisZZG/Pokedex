/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppokemon;

/**
 *
 * @author EQUIPO
 */
public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    public Pikachu(int num_pokedex, String nombrePokemon, Double pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }
    
    

    @Override
    public String atacarPlacaje() {
        return "Soy Pikachu y estoy atacando con Placaje";
    }

    @Override
    public String atacarArañazo() {
        return "Soy Pikachu y estoy atacando con Arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Pikachu y estoy atacando con Mordizco";
    }

    @Override
    public String atacarImpactrueno() {
        return "Soy Pikachu y estoy atacando con ImpacTrueno";
    }

    @Override
    public String atacarPunoTrueno() {
        return "Soy Pikachu y estoy atacando con Puño Trueno";
    }

    @Override
    public String atacarRayo() {
        return "Soy Pikachu y estoy atacando con Rayo";
    }

    @Override
    public String atacarRayoCarga() {
        return "Soy Pikachu y estoy atacando con Rayo Carga";
    }
    
}
