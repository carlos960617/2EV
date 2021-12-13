package com.company.Primera_Evaluacion.condiconales_y_whiles;

import java.util.Scanner;

public class BuenosDiasyRomboVacio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una hora valida");

        int hora= sc.nextInt();

        if(hora >= 6 && hora <=13){
            System.out.println("¡Buenas días!");
        }else if (hora >= 14 && hora <=20){
            System.out.println("¡Buenas tardes!");
        }else if (hora >=21 && hora <=24){
            System.out.println("¡Buenas noches!");
        }else if (hora >=1 && hora <=5){
            System.out.println("¡Que tarde! A dormir ahora mismo...");
        }else{
            System.out.println("Esta hora no existe");
        }

    }

    public static class romboVacio {

        public static void main(String[] args) {

            int ancho = 7;

            for(int i=0;i<ancho;i++){
                for(int j=0; j<ancho; j++){
                    if((j==(ancho/2)-j ||j==((ancho/2)+j))  && j==i){
                        System.out.print("*");

                    }else{
                        System.out.print(" ");
                    }


                }

                System.out.println(" ");
            }

            /*for(j=0;j<ancho;){
                    if(i== 0 && j== ancho/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    if(i==1 && j==(ancho/2)+1 || j==(ancho/2)-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    if(i==2 && j==(ancho/2)+2 || j==(ancho/2)-2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }
                j++;*/
        }
    }
}
