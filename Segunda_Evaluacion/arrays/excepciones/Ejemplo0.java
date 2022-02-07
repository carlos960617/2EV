package com.company.Segunda_Evaluacion.arrays.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo0 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        System.out.println("Introduzca un entero:");
        try {
            numero = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("No has introducido un número.");
            //esto imprime el error por si vols vore-lo. Se llama "pila de errores"
            e.printStackTrace();
        }
        System.out.println("Sigue ejecutándose el programa");

    }

}
