package com.company.Segunda_Evaluacion.arrays.herencia;

import java.util.Scanner;

public class alumno extends persona{

    static Scanner sc = new Scanner(System.in);

    public int curso;

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public alumno(String nif, String nom, int curso){
        super(nif, nom);
        this.curso = curso;
    }


    @Override
    public void leer(){
        super.leer();
        System.out.println("Introduce el curso");

        curso = sc.nextInt();
    }
}
