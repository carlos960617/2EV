package com.company.repaso_clase;

import java.util.Scanner;

public class Temperatura {

    public static double ftoC(double temp){

        return 5.0/9.0*(temp-32);
    }

    public static double Ctof(double temp){
        return 9.0/5.0*temp + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la temperatura deseada");

        double temp = sc.nextDouble();

        System.out.println("""
                Elige a que la quieres pasar:\s
                c = a celsius
                f = a fahreinheit""");

        char opt = sc.next().charAt(0);

        double result = 0.0;

        //puedes hacer Temperatura.ftoC o directamente ftoc

        if(opt == 'c'){
            result = ftoC(temp);
        }else if(opt == 'f'){
            result = Ctof(temp);
        }else{
            System.out.println("Ese caracter no es valido baby.");
        }

        System.out.println("El resultado de la conversion es = "+ result +".");




    }
}
