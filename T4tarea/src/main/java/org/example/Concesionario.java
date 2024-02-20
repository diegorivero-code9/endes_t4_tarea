package org.example;

import java.util.ArrayList;

/**
 * Define que Autos hay dentro del Concesionario y añade nuevos Autos
 * Esta clase define objetos (Concesionario) que contiene una serie de Autos
 * @author Diego Rivero Entrialgo
 *  @version 1.0, 2024/02/20
 */
public class Concesionario {
    /**
     * Lista de autos
     * Objeto Arraylist que contendrá objetos de tipo autos
     */

    private ArrayList<Auto> autos;
    /**
     * Constructor de la clase Concesionario
     * Constructor Concesionario que inicializa la lista de libros como una colección de Arraylist vacía
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }
    /**
     * Método void que agrega Autos al Concesionario
     * Añade Autos al Concesionario pasando el parámetro autos
     * @param auto El parámetro auto define el Auto que se añade al Concesionario
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }
    /**
     * Método para listar autos
     * @return autos obtenidos a partir del listado
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }
    /**
     * Método void que muestra los Autos
     * Imprime los Autos que se encuentran dentro del Concesionario
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
