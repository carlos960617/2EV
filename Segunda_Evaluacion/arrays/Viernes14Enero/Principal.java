package com.company.Segunda_Evaluacion.arrays.Viernes14Enero;

import java.util.Scanner;

import static com.company.Segunda_Evaluacion.arrays.Viernes14Enero.tipo_coche.FAMILIAR;

public class Principal {

    public static void main(String[] args) {

        Coche primerCoche = new Coche();

        primerCoche.setNumBastidor(100);

        primerCoche.setModelo("Renault");

        primerCoche.setColor("Azul");

        primerCoche.setMetalizado(true);

        primerCoche.setTipo(FAMILIAR);

        System.out.println("Numero de Bastidor: "+ primerCoche.getNumBastidor() + "     Modelo: "+ primerCoche.getModelo() + "      Metalizado: "+ primerCoche.isMetalizado()+ "        Color: "+ primerCoche.getColor()+"       Tipo: "+ primerCoche.getTipo());

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas copias de primerCoche quieres realizar?");

        int numCopias = sc.nextInt();

        Coche[] copiasCoche = new Coche[numCopias];

        for(int i=0, num=1; i<numCopias;i++, num++){

            /*String nombreObj = "primerCocheCopia" + num;

            Coche nombreObj= new Coche(primerCoche);

            ¿Cómo se podría personalizar el nombre de los objetos copia?*/

            copiasCoche[i] = new Coche(primerCoche);

            int numBase = primerCoche.getNumBastidor();

            copiasCoche[i].setNumBastidor(numBase + num);

                System.out.println("Numero de Bastidor: "+ copiasCoche[i].getNumBastidor()+"       Modelo: "+ copiasCoche[i].getModelo()+"      Metalizado: "+ copiasCoche[i].isMetalizado()+"      Color: "+ copiasCoche[i].getColor()+"       Tipo: "+ copiasCoche[i].getTipo());

        }



    }



}
