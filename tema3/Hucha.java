package com.company.tema3;

import java.util.Scanner;

public class Hucha {
    String nombre;
    String meta;
    int ahorrado;

    public Hucha(String nombre1, String meta1){
        nombre = nombre1;
        ahorrado = 0;
        meta = meta1;
    }

    public void setAhorrado (int monedaNueva){
        if(monedaNueva == 2 || monedaNueva == 1 || monedaNueva ==5){
            ahorrado += monedaNueva;
        }else{
            System.out.println("La hucha no admite esa cantidad de dinero.");}
    }

    public void infoHucha(){
        System.out.println("La hucha "+nombre+ "contiene "+ahorrado+" €.");
    }
    public static void main(String[] args) {
        Hucha hucha1 = new Hucha("Pepito", "PS5");

        Scanner sc = new Scanner(System.in);


        System.out.println("Hola "+hucha1.nombre+". ¿Cuanto dinero vas a meterme hoy?");

        int dineroAhorrado = sc.nextInt();

        System.out.println("Has introducido "+dineroAhorrado+ " euros.");

        hucha1.setAhorrado(dineroAhorrado);

        System.out.println("Ahora tu hucha tiene "+hucha1.ahorrado+ " euros.");

        /*version con while para admitir dinero mientras no se supere la capacidad de las huchas de 100 euros

         while(hucha1.ahorrado <= 100){
            System.out.println("Hola "+hucha1.nombre+". ¿Cuanto dinero vas a meterme hoy?");

            int dineroAhorrado = sc.nextInt();

            System.out.println("Has introducido "+dineroAhorrado+ " euros.");

            hucha1.setAhorrado(dineroAhorrado);

            System.out.println("Ahora tu hucha tiene "+hucha1.ahorrado+ " euros.");

        }
            System.out.println("Lo siento la hucha esta llena");
         */

    }
}
