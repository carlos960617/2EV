package com.company.Segunda_Evaluacion.arrays.herencia.viernes18;

import org.w3c.dom.ls.LSOutput;

public class mainGeometria {

    public static void main(String[] args) {
        circulo obj1 = new circulo(23);

        cilindro obj2 = new cilindro(12, 32);

        System.out.println("Datos del primer circulo= \n" +
                "Area: "+obj1.getArea() +"\n" +
                "Radio: "+ obj1.getRadio());

        System.out.println("Datos del primer cilindro=\n" +
                "Altura: "+obj2.getAltura()+"\n" +
                "Radio:" +obj2.getRadio()+"\n" +
                "Area: " +obj2.getArea()+"\n"+
                "Volumen " + obj2.getVolume());
    }




}
