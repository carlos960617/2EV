package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

import java.util.Scanner;

public class perroLadrador {

    public static boolean hayQueDespertarse(boolean ladrido, int horaDelDia ){

        //piensa si hay que añadir un parentesis entre los OR para que ladrido && se evalue con ambas situaciones

        if(ladrido && horaDelDia<8 || horaDelDia>22){
            return horaDelDia <= 23 && horaDelDia >= 0;
        }else{return false;}


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\"false\" si el perro no ladra y \"true\" si esta ladrando");

        boolean ladra = sc.nextBoolean();

        System.out.println("¿Qué hora es?");

        int hora = sc.nextInt();

        boolean despierta = hayQueDespertarse(ladra, hora);

        System.out.println("¿Hay que despertarse?\n" +
                ""+despierta);



    }
}
