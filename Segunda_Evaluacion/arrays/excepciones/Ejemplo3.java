package com.company.Segunda_Evaluacion.arrays.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[5];

        try{
            System.out.println("Introduce un int");
            array[0] = sc.nextInt();
            System.out.println("Has introducido algo en indice: "+array[8]);

        }catch(InputMismatchException ex){
            System.out.println("El valor introducido no es un int");

        }catch(ArrayIndexOutOfBoundsException ex2){
            System.out.println("El indice del array no existe");

        }

    }

}
