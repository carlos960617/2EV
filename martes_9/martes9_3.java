package com.company;

import java.util.Random;
import java.util.Scanner;

public class martes9_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int guess = sc.nextInt();

        Random rand = new Random();

        int meta = rand.nextInt(101);

        int count= 1;

        while(guess != meta){
            System.out.println("1, 2, 3... ¡prueba otra vez!");
            count ++;

            if(guess > meta){
                System.out.println("Tu numero es mayor que el numero a adivinar ");
            }else{
                System.out.println("Tu numero es menor que el numero a adivinar");
            }

            guess = sc.nextInt();
        }

        System.out.println("Enhorabuena, ¡lo has acertado! \n" +
                "Y solo lo has tenido que intentar "+count+ " veces.");
    }
}
