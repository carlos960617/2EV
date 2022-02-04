package com.company.Segunda_Evaluacion.arrays.Viernes4Febrero;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    static Scanner sc = new Scanner(System.in);
    public String nombre;
    public  float altura;

    public Alumno(String n, float a){
        nombre = n;
        altura = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Datos del alumno "+nombre+":\n" +
                "Altura= "+altura+"\n";
    }

    public static void incluirAlumnos(ArrayList<Alumno> a){
        System.out.println("Introduce el primer alumno");

        String nombre = sc.nextLine();
        Alumno alumno;
        float altura;

        while(!nombre.equals("salir")){

            System.out.println("Introduce su altura");
            altura = sc.nextFloat();
            sc.nextLine();
            alumno = new Alumno(nombre, altura);
            a.add(alumno);
            System.out.println("Introduce el siguiente alumno");
            nombre= sc.nextLine();
        };
    }

    public static void mostrarAlumnos(ArrayList<Alumno> a){

        for(Alumno A: a){
            System.out.println(A);
        }
    }

    public static float calcularMedias(ArrayList<Alumno> a){

        float suma=0;

        for (Alumno alumno : a) {
            suma += alumno.getAltura();
        }

        return suma/a.size();
    }




    public static void main(String[] args) {

        ArrayList<Alumno> severo = new ArrayList<Alumno>();

        incluirAlumnos(severo);

        /* Con esto ya me daba los alumnos, aunque es verdad que con menos opciones de formato
         System.out.println(severo);*/

        mostrarAlumnos(severo);



    }


}
