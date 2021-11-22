package com.company.repaso_clase;

import java.util.Scanner;

public class anioBisiesto {




    public static boolean esBisiesto(int anio){

        return ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anio = sc.nextInt();

        if (esBisiesto(anio)){
            System.out.println("Este año es bisiesto");
        }else{
            System.out.println("Este año no es bisiesto");
        }




    }

}
