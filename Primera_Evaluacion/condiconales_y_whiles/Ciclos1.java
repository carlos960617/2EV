package com.company.Primera_Evaluacion.condiconales_y_whiles;

import java.util.Scanner;

public class Ciclos1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();

        int suma=0;

        while(a >= 0){

            a = sc.nextInt();

            suma += a;

        }

        System.out.println("La suma de los digitos registrados "+suma+".");

    }

}
