/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppokemon;

/**
 *
 * @author EQUIPO
 */
public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    public Bulbasaur(int num_pokedex, String nombrePokemon, Double pesoPokemon, char sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }
    
    

    @Override
    public String atacarPlacaje() {
        return "Soy Bulbasaur y estoy atacando con Placaje";
    }

    @Override
    public String atacarArañazo() {
        return "Soy Bulbasaur y estoy atacando con Arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Bulbasaur y estoy atacando con Mordizco";
    }

    @Override
    public String atacarParalizar() {
       return "Soy Bulbasaur y estoy atacando con Paralizar";
    }

    @Override
    public String atacarDrenaje() {
        return "Soy Bulbasaur y estoy atacando con Drenaje";
    }

    @Override
    public String atacarHojaAfilada() {
        return "Soy Bulbasaur y estoy atacando con Hoja Afilada";
    }

    @Override
    public String atacarLatigoCepa() {
        return "Soy Bulbasaur y estoy atacando con Latigo Cepa";
    }
    
}
