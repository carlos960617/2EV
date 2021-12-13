package com.company.Primera_Evaluacion.condiconales_y_whiles.martes_30;

import java.util.Scanner;

public class mainProfesor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Profesor.setCostExtra(20);

        Profesor p1 = new Profesor();

        p1.leerProfesores();

        System.out.println("Introduce los datos del segundo profesor:");

        Profesor p2 = new Profesor(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextInt(), sc.nextDouble() );

        System.out.println("Profesorado: "+Profesor.getPlantilla());

        System.out.println("Nominas:\n" +
                p1+"\n" +
                p2+"");
    }
}
