package com.company.Primera_Evaluacion.condiconales_y_whiles;

import java.util.Scanner;

public class Condicionales2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota con decimales:");

        double nota = sc.nextDouble();

        if (nota < 5){
            System.out.println("Suspenso");
        }else if (nota >= 5 && nota <6){
            System.out.println("Suficiente");
        }else if (nota >= 6 && nota <7){
            System.out.println("Bien");
        }else if (nota >= 7 && nota <9){
            System.out.println("Notable");
        }else if (nota >= 9 && nota <10){
            System.out.println("Notable");
        }else if (nota == 10){
            System.out.println("Matricula de honor");
        }else{
            System.out.println("Nota no válida.");
        }
    }
}
