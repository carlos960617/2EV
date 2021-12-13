package com.company.Primera_Evaluacion.condiconales_y_whiles.T4_2;

import java.util.Scanner;

public class T4_2$2VentasRestaurante {

    public static void main(String[] args) {

        //esto es un poco inútil, pero como ya lo he escrito lo dejo:

        double $1 = 2.00;
        double $2 = 1.50;
        double $3 = 1.75;
        double $4 = 2.00;
        double $5 = 2.75;
        double $6 = 2.00;
        double $7 = 2.60;
        double $8 = 3.00;

        String p1 = "Refresco";
        String p2 = "Cerveza";
        String p3 = "Agua Mineral";
        String p4 = "Ensalada";
        String p5 = "Salchichas";
        String p6 = "Bocadillo";
        String p7 = "Sopa";
        String p8 = "Pastel";

        Scanner sc = new Scanner(System.in);

        int codigo = 1;

        double bebidas = 0;
        double ventas = 0;
        double comidas = 0;
        double cuenta = 0;

        while(codigo != 0){

            System.out.println("Introduce el codigo del producto que desees:");

            codigo = sc.nextInt();

            switch (codigo){
                case 1:
                    System.out.println("Has elegido "+ p1 +".");
                    bebidas++;
                    ventas++;
                    cuenta += $1;
                    break;

                case 2:
                    System.out.println("Has elegido "+ p2 +".");
                    bebidas++;
                    ventas++;
                    cuenta += $2;
                    break;

                case 3:
                    System.out.println("Has elegido "+ p3 +".");
                    bebidas++;
                    ventas++;
                    cuenta += $3;
                    break;

                case 4:
                    System.out.println("Has elegido "+ p4 +".");
                    comidas++;
                    ventas++;
                    cuenta += $4;
                    break;

                case 5:
                    System.out.println("Has elegido "+ p5 +".");

                    comidas++;
                    ventas++;
                    cuenta += $5;
                    break;

                case 6:
                    System.out.println("Has elegido"+ p6 +".");

                    comidas++;
                    ventas++;
                    cuenta += $6;
                    break;

                case 7:
                    System.out.println("Has elegido"+ p7 +".");

                    comidas++;
                    ventas++;
                    cuenta += $7;
                    break;

                case 8:
                    System.out.println("Has elegido"+ p8 +".");

                    comidas++;
                    ventas++;
                    cuenta += $8;
                    break;

                default:

                    System.out.println("Cerrando caja, calculando...");

        }


        }

        double por100Bebidas = (bebidas*100)/ventas;

        double por100comidas = (comidas*100)/ventas;

        System.out.println("El total de ventas de hoy ha sido: "+ventas+" productos con un valor de "+cuenta+" euros.\n" +
                "La venta de bebidas ha sido de un "+por100Bebidas+" % \n" +
                "La venta de comidas ha sido de un "+por100comidas+" %");


    }
}
