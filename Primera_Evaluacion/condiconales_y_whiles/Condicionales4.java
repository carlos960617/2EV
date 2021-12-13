package com.company.Primera_Evaluacion.condiconales_y_whiles;

import java.util.Scanner;

public class Condicionales4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros y un operador");

        double a = sc.nextDouble();

        double b = sc.nextDouble();

        char operador = sc.next().charAt(0);

        double resultado= 0.0;

        System.out.println(operador);

        switch (operador){
            case '/':
                resultado = a/b;
                break;

            case '*':
                resultado = a*b;
                break;

            case '+':
                resultado = a+b;
                break;

            case '-':
                resultado = a-b;
                break;

            case '%':
                resultado = a%b;
        }

        System.out.println("Si calculamos "+a+""+operador+""+b+" obtenemos: "+resultado+".");
    }
}
