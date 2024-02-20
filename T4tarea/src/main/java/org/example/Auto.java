package org.example;

import java.util.ArrayList;

/**
 * Define que marca y modelo de presenta cada auto
 * Esta clase define objetos (autos) que tienen una marca y un modelo determinado
 * @author Diego Rivero Entrialgo
 * @version 0.1, 2004/05/30
 */
public class Auto {
    /**
     * Se define la marca del Auto como String, parámetro privado
     */
    private String marca;
    /**
     * Se define el modelo del Auto como String, parámetro privado
     */
    private String modelo;

    /**
     * Constructor para los Autos con 2 parámetros
     * El constructor Auto pasa los parámetros marca y modelo, se espera que el modelo exista dentro de la marca elegida
     * @param marca El parámetro marca define la marca de cada Auto
     * @param modelo El parámetro modelo define el modelo especifico de cada Auto
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }//Cierre del constructor
    /**
     * Obtiene el atributo privado que corresponde a la marca del Auto
     * @return marca como String*/
    public String getMarca() {
        return marca;
    }
    /**
     * Obtiene el atributo privado que corresponde a la marca del Auto
     * @param marca El parámetro marca del auto se pasa como String
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Obtiene el atributo público que corresponde al modelo del Auto pero no devuelve nada
     * @return modelo como String*/
    public String getModelo() {
        return modelo;
    }
    /**
     * Obtiene el atributo privado que corresponde al modelo del Auto pero no devuelve nada
     * @param modelo El parámetro modelo del auto se pasa como String
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Sobreescribe el método toString
     * Método que devuelve la marca y modelo respectivamente de cada Auto
     * @return Marca y modelo de cada Auto
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }//Cierre del método
}//Cierre de la clase


