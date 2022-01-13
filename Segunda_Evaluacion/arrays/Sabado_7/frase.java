package com.company.Segunda_Evaluacion.arrays.Sabado_7;

import java.util.Arrays;

public class frase {

    char letra;
    int frecuencia = 0;

    public frase(String frase1, char letter){

        for(int i=0; i<frase1.length();i++){

            if(frase1.charAt(i) == letter){

                frecuencia ++;

            }

        }

        letra = letter;

    }

    @Override
    public String toString() {

        return letra+": "+frecuencia;

    }

    public static void main(String[] args) {

        frase frase1 = new frase("My belly is full", 'b');

        frase frase2 = new frase("All my friends are dead", 'd');

        /*frase frase1 = new frase['A', 2]];*/

        frase[] recuento = new frase[26];

        recuento[0] = frase1;

        recuento[1] = frase2;

        System.out.println(Arrays.toString(recuento));


    }

}
