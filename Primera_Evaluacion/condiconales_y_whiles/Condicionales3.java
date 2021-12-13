package com.company.Primera_Evaluacion.condiconales_y_whiles;

import java.util.Scanner;

public class Condicionales3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un mes del año con la primera en mayuscula");

        String mes= sc.nextLine();

        switch (mes){
            case "Enero":
                System.out.println("Este mes tiene 31 días");
                break;

            case "Febrero":
                System.out.println("Este mes tiene 28 o 29 días");
                break;

            case "Marzo":
                System.out.println("Este mes tiene 31 días");
                break;

            case "Abril":
                System.out.println("Este mes tiene 30 días");
                break;

            case "Mayo":
                System.out.println("Este mes tiene 31 días");
                break;

            case "Junio":
                System.out.println("Este mes tiene 30 días");
                break;

            case "Julio":
                System.out.println("Este mes tiene 31 días");
                break;

            case "Agosto":
                System.out.println("Este mes tiene 31 días");
                break;

            case "Septiembre":
                System.out.println("Este mes tiene 30 días");
                break;

            case "Octubre":
                System.out.println("Este mes tiene 31 días");
                break;

            case "Noviembre":
                System.out.println("Este mes tiene 30 días");
                break;

            case "Diciembre":
                System.out.println("Este mes tiene 31 días");
                break;

            default:
                System.out.println("Ese mes no es válido");
        }


    }
}
