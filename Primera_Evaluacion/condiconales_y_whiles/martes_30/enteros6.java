package com.company.Primera_Evaluacion.condiconales_y_whiles.martes_30;

import java.util.Scanner;

public class enteros6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;

        do{
            System.out.println("Introduzca el primer numero seleccionado");
            num1 = sc.nextInt();
        }while(!(num1 >= 1 && num1 <= 49));

        do{
            System.out.println("Introduzca el segundo numero seleccionado");
            num2 = sc.nextInt();
        }while(!(num2 >= 1 && num2 <= 49 && num2 != num1));
        do{
            System.out.println("Introduzca el tercer numero seleccionado");
            num3 = sc.nextInt();
        }while(!(num3 >= 1 && num3 <= 49 && num3 != num2 && num3 != num1));
        do{
            System.out.println("Introduzca el cuarto numero seleccionado");
            num4 = sc.nextInt();
        }while(!(num4 >= 1 && num4 <= 49 && num4 != num2 && num4 != num3 && num4 != num1));
        do{
            System.out.println("Introduzca el quinto numero seleccionado");
            num5 = sc.nextInt();
        }while(!(num5 >= 1 && num5 <= 49 && num5 != num4  && num5 != num2&& num5 != num3 && num5 != num1));
        do{
            System.out.println("Introduzca el sexto numero seleccionado");
            num6 = sc.nextInt();
        }while(!(num6 >= 1 && num6 <= 49 && num6 != num5 && num6 != num4  && num6 != num2 && num6 != num3 && num6 != num1));


        for(int i = 0; i<10 ; i++){
            /*if(i == 0){
                System.out.print(" ");
            }else{System.out.print(i); }*/
            for(int j = 0; j<5;j++){
                int k = 10;
                int color = j*k+i;
                if(j==0 && i==0){
                    System.out.print("  ");
                }else if(color == num1 || color == num2 || color == num3 || color == num4 || color == num5 || color == num6){
                    System.out.print("\033[031m" + color +"\033[037m"+" ");
                }else{
                    System.out.print(j*k+i+" ");
                }


            }
            System.out.println(" ");
        }



    }



}
