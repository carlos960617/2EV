package com.company.Segunda_Evaluacion.arrays.herencia;

public class B extends A{

    @Override
    public boolean isMayus(){

        System.out.println("Esta version del metodo es para B");
        return super.isMayus();
    }
}
