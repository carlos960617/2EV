package com.company;

import java.util.Scanner;

public class martes9_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu sueldo mensual:");

        double mensual = sc.nextInt();

        double anual = mensual*12;

        double impuesto = 1;

        if (anual<10000){

            impuesto = anual * 0.05;

        }else if(anual > 10001 && anual <= 25000){

            impuesto = anual * 0.12;

        }else if(anual >25001 && anual <=38000){

            impuesto = anual * 0.15;

        }else if(anual >38001 && anual <=600000){

            impuesto = anual * 0.22;

        }else if(anual > 60000){

            impuesto = anual * 0.30;

        }else{
            System.out.println("El sueldo introducido es incompatible");
        }

        System.out.println("Según tu salario, el impuesto anual a pagar es de "+impuesto+" euros.");

    }
}
