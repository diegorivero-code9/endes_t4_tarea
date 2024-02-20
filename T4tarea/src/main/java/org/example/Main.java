package org.example;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Peugeot", "308");
        Auto auto2 = new Auto("Seat", "Leon");

        Concesionario concesionario1 = new Concesionario();

        concesionario1.agregarAuto(auto1);
        concesionario1.agregarAuto(auto2);

        concesionario1.imprimirAutos();
    }
}