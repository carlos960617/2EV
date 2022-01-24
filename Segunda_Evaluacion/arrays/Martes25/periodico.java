package com.company.Segunda_Evaluacion.arrays.Martes25;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class periodico {

    public static String[] semanal (int[][] anual){

        String[] semanal = new String[anual.length];

        int cumulo = 0;

        for(int i=0;i<anual.length;i++){
            for(int j=0;j<anual[i].length;j++){

                cumulo += anual[i][j];
            }
            if(i%5 == 0 && i !=0){
                semanal[i] = "\nSemana "+(i+1)+": "+cumulo/7;
            }else{
                semanal[i] = "Semana "+(i+1)+": "+cumulo/7;
            }

            cumulo = 0;

        }

        return semanal;
    }

    public static int domingos (int[][] anual){

        int cumulo = 0;

        for(int i=0;i<anual.length;i++){

            cumulo += anual[i][6];
        }

        return cumulo/52;
    }





    public static void main(String[] args) {



        int[][] venta = new int[52][7];

        for(int i = 0;i<venta.length;i++){
            for(int j=0;j<venta[i].length;j++){
                venta[i][j]= 0;
                //venta[i][j]= (int)(Math.random()*5000);
                //System.out.print(venta[i][j]+", ");
            }

            //System.out.println("");
        }

        String[] result1 = periodico.semanal(venta);



        System.out.println("Media de ventas por semanas al año: \n" +
                " "+ Arrays.toString(result1));

        System.out.println("Media de ventas los domingos al año: "+periodico.domingos(venta));




    }
}
