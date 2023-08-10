/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apppokemon;

/**
 *
 * @author EQUIPO
 */
public class AppPokemon {

    public static void main(String[] args) {
        
        //Pikachu
        Pikachu pika = new Pikachu();
        pika.nombrePokemon = "Pepito";
        
        pika.tipo = "Electrico";
        System.out.println("El nombre del pokemon es: " + pika.nombrePokemon);
        System.out.println("Es del tipo: " + pika.tipo);
        System.out.println("uno de sus ataques es: " + pika.atacarArañazo());
        System.out.println("Otro: " + pika.atacarImpactrueno());
        
    }
}
