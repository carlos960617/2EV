package com.company.tema_2;

import java.util.Scanner;

public class Cambio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un importe sin decimales:");

        int importe = sc.nextInt();

        int aR = importe%500;
        int a = importe/500;
        int bR = aR%200;
        int b = aR/200;
        int cR = bR%100;
        int c = bR/100;
        int dR = cR%50;
        int d = cR/50;
        int eR = dR%20;
        int e = dR/20;
        int fR = eR%10;
        int f = eR/10;
        int gR = fR%5;
        int g = fR/5;

        System.out.println("Le devuelvo "+ a+ " billete(s) de 500, "+b+" de 200, "+c+" de 100, "+d+" de 50, "+e+" de 20, "+f+" de 10, "+g+" de 5, y "+gR+" moneda(s).");
        /*System.out.println("a."+ aR+ " b." +"" +bR+" c."+cR+"" + " d."+dR+" e."+eR+" f."+fR+"g."+gR+"h.");*/

    }
}
