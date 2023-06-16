package org.example;

public class Main {
    public static void main(String[] args) {

        // Programacion orientada a objetos
        // Objetos
        // Clases
        // Metodos
        // Herencia
        // Abstraccion
        // Polimorfismo
        // Encapsulamiento


        // Objeto
        // Instancia de una clase con datos especificos. Objetos normalmente puede corresponder a objetos reales.

        // Clase
        // Tipo de dato definido por el usuario que se utiliza como borrador para objetos individuales. Contiene atributos y metodos.


        Coche coche1 = new Coche();
        Coche coche2 = new Coche("rojo", "honda", "2020", "hibrido", 4, 5);

        coche1.llantas = 4;
        coche1.marca = "nissan";

        coche1.acelerar();
        coche2.encender();

        System.out.println("El coche 1 tiene " + coche1.llantas + " llantas");
        System.out.println("El coche 2 tiene " + coche2.llantas + " llantas");

        System.out.println("El coche 1 es " + coche1.marca);
        System.out.println("El coche 2 es " + coche2.marca);
    }
}