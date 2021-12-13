package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

public class mainCalculadora {

    public static void main(String[] args) {

        Calculadora calc1 = new Calculadora();

        calc1.setPrimerNumero(5.0);
        calc1.setSegundoNumero(4);
        System.out.println("suma = "+calc1.getResultadoSuma());
        System.out.println("resta = "+calc1.getResultadoResta());
        calc1.setPrimerNumero(5.25);calc1.setSegundoNumero(0);
        System.out.println("multiplicación= "+ calc1.getMultiplicationResult());
        System.out.println("división= "+calc1.getDivisionResult());

    }



}
