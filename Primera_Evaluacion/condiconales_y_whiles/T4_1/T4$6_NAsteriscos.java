package com.company.Primera_Evaluacion.condiconales_y_whiles.T4_1;

import java.util.Scanner;

public class T4$6_NAsteriscos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        while (count < n){
            System.out.print("*");
            count ++;
        }
    }
}
