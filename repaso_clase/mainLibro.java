package com.company.repaso_clase;

import jdk.swing.interop.SwingInterOpUtils;

public class mainLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Los desposeidos", "Ursula k.", 25, 4);
        Libro libro2 = new Libro("El nombre del viento", "Patric Roufus", 0, 0);

        System.out.println(libro1);

        System.out.println(libro2.toString());

        System.out.println(libro2.prestamo());
    }
}
