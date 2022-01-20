package com.company.Segunda_Evaluacion.arrays.Ordenacion;


/*Ejercicio 5*/
public class EntradaTelefono /*implements Comparable*/
{

    private String nombre;
    private int numero;

    public EntradaTelefono(String nom1, int num1){

        nombre = nom1;
        numero = num1;

    }



    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public static void main(String[] args) {

    }


    /*@Override
    public int compareTo(EntradaTelefono o ) {
        if(this.nombre.compareTo(o.nombre)>0){
            return 1;
        }
    }*/
}
