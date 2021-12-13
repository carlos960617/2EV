package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

import java.util.Scanner;

public class conversionPersonalizada {



    public static double toBitCoin (double dinero, char currency){


        return switch (currency) {
            case 'd' -> dinero * 0.000017;
            case 'e' -> dinero * 0.000020;
            case 'r' -> dinero * 4289882.25;
            case 'y' -> dinero * 369223.87;
            default -> 0;
        };

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de dinero");

        double cantidad = sc.nextDouble();

        System.out.println("""
                Introduce la moneda
                d = dolares
                e = euros
                y = yuanes
                r = rupias""");

        char moneda = sc.next().charAt(0);

        double cambio = toBitCoin(cantidad, moneda);

        System.out.println("La cantidad de "+cantidad+" \n" +
                "equivale a "+cambio+ " bitcoins.");







    }
}
