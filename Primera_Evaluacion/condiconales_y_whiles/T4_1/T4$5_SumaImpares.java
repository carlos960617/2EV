package com.company.Primera_Evaluacion.condiconales_y_whiles.T4_1;

public class T4$5_SumaImpares {

    public static void main(String[] args) {

        int num = 0;

        int suma = 0;

        int cuenta = 0;

        while (cuenta < 20){

            if (num%2 != 0){
                cuenta++;
                System.out.println("La cuenta de impares esta a "+cuenta+"");
                suma += num;
                System.out.println("La suma de los impares es "+suma+"");
                num++;
            }else{num++;}

            System.out.println("El valor del numero es "+num+".");

        }



        System.out.println("Has sacado los 20 primeros primos, la suma de estos es= "+suma+".");

    }


}
