package com.company.Segunda_Evaluacion.arrays.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try{
            double altura = sc.nextDouble();
            /*el codigo que siga al error no se ejecutará,
             salta directamente al catch
             */
        }catch(InputMismatchException ex){

        }

    }
}
