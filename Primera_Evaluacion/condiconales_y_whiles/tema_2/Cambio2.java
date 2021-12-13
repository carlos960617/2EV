package com.company.Primera_Evaluacion.condiconales_y_whiles.tema_2;

import java.util.Scanner;

public class Cambio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un importe sin decimales:");

        int importe = sc.nextInt();

        int a = importe/500;
        int b = (importe%500)/200;
        int c = (importe-(a*500 + b*200))/100;
        int d = (importe-(a*500 + b*200 + c*100))/50;
        int e = (importe-(a*500 + b*200 + c*100 + d*50))/20;
        int f = (importe-(a*500 + b*200 + c*100 + d*50 + e*20))/10;
        int g = (importe-(a*500 + b*200 + c*100 + d*50 + e*20 + f*10 ))/5;
        int h = (importe-(a*500 + b*200 + c*100 + d*50 + e*20 + f*10 + g*5));

        System.out.println("Te devolvemos "+a+ " billete(s) de 500, "+b+ " billete(s) de 200 "+c+ " de 100,\n" +
                ""+d+" billete(s) de 50 "+e+ " billetes de 20, "+f+ " billete(s) de 10 "+g+ " billete(s) de 5\n" +
                " y "+h+" monedas.");
    }
}
