package com.company;

public class ProgSemaforo {

    public static void main(String[] args) {
        Semaforo misemaforo = new Semaforo();
        System.out.println("Creación de la clase Semaforo (solo propiedades)");
        System.out.println("");

        System.out.println("Ampliación de la clase Semaforo (añadimos métodos set y get), inserción de datos y extracción de datos");
        System.out.println("El color del semáforo es: "+misemaforo.getColor());
        if (!misemaforo.isParpadea())
            System.out.println(" Y no está parpadeando");
        misemaforo.setColor(color_semaforo.ambar);
        System.out.println("El color del semáforo es: "+misemaforo.getColor());
        if (misemaforo.isParpadea())
            System.out.println(" Y está parpadeando");

        System.out.println("");
    }
}
