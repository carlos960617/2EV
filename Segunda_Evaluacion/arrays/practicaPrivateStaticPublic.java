package com.company.Segunda_Evaluacion.arrays;

public class practicaPrivateStaticPublic {

    private String nombre = "Carlos";
    static int edad = 25;
    public double felicidad = 9.3;

    public static void main(String[] args) {


        //Los estaticos pueden modificarse a traves de la clase directamente
        practicaPrivateStaticPublic.edad = 20;

        practicaPrivateStaticPublic tipo1 = new practicaPrivateStaticPublic();

        //los public se pueden llamar fuera de clase pero solo a traves de un objeto de la clase:
        // (imaginate que esto esta en otra clase)*/
        tipo1.felicidad = 8.8;

        //Los privados solo se pueden modificar a traves de un objeto de la clase y solo dentro de la misma clase
        tipo1.nombre = "Maria";
    }


    /*
    * Los metodos estaticos pueden ser accedidos sobre la clase general, por lo tanto no deben modificar
    * atributos de la clase privados porque si no el atributo se modificaria para todos los objetos futuros
    *
    *
    * Los atributos publicos pueden acceder*/
}


