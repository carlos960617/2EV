package com.company.T4_1;

import java.util.Scanner;

public class T4$2_MenuRestaurante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Estos son los productos disponibles\n" +
                "Codigo      Producto\n" +
                "-----------------------\n" +
                "1           Refresco      \n" +
                "2           Cerveza\n" +
                "3           Agua Mineral\n" +
                "4           Ensalada\n" +
                "5           Salchcichas\n" +
                "6           Bocadillo\n" +
                "7           Sopa\n" +
                "8           Papel");

        System.out.println("Elige un codigo según el producto que quieras consumir:");

        int codigo = sc.nextInt();

        switch (codigo){
            case 1:
                System.out.println("Refresco por 2 €");
                break;

            case 2:
                System.out.println("Cerveza por 1,50 €");
                break;

            case 3:
                System.out.println("Agua Mineral por 1,75 €");
                break;

            case 4:
                System.out.println("Ensalada 2 €");
                break;

            case 5:
                System.out.println("Salchichas 2,75 €");
                break;

            case 6:
                System.out.println("Bocadillo 2 €");
                break;

            case 7:
                System.out.println("Sopa 2,60 €");
                break;

            case 8:
                System.out.println("Pastel 3,0 €");
                break;

            default:
                System.out.println("Ese codigo no corresponde a ningun producto");
        }

        if (codigo >= 1 && codigo <=3){
            System.out.println("Es bebida");
        }else{
            System.out.println("Es comida");
        }





    }

}
