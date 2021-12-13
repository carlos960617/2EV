package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

import java.util.Scanner;

public class T4_R$Primos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int limite = sc.nextInt();

        System.out.print("1, 2");

        boolean esPrimo = true;

        for(int i=3;i<=limite;i++){

            esPrimo = true;
            for(int j=2; j<i;j++){
                if(i%j == 0){

                    esPrimo = false;
                }

            }

            if (esPrimo){
                System.out.print(", "+i);
            }
        }
    }
}
