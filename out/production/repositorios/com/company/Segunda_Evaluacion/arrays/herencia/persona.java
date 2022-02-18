package com.company.Segunda_Evaluacion.arrays.herencia;

import java.util.Scanner;

public class persona {

    static Scanner sc = new Scanner(System.in);

    public String nif;
    public String nombre;

    public persona(String nif, String nombre){
        this.nif = nif;
        this.nombre = nombre;

    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void leer(){

        System.out.println("Introduce el DNI");

        nif = sc.nextLine();

        System.out.println("Introduce el nombre");

        nombre = sc.nextLine();
    }
}
