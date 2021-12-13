package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

import java.util.Scanner;

public class SpeedConverter {


    public static long toMilesPerHour(double kilometersPerHour){

        long result = Math.round(kilometersPerHour/1.609);

        if(kilometersPerHour < 0.0){
            return -1;

        }else{return result;}
    }

    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Valor inválido");
        }else{
            System.out.println(kilometersPerHour+" km/h =="+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce km/h para convertirlos a millas. No olvides separar los decimales \n" +
                "con una coma no con un punto.");

        double kph = sc.nextDouble();

        System.out.println(toMilesPerHour(kph));

        printConversion(kph);


    }

}
