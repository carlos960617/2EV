package com.company.Segunda_Evaluacion.arrays.Viernes14Enero;

enum tipo_coche {MINI, UTILITARIO, FAMILIAR, DEPORTIVO}
enum modo_seguro {TERCEROS, TODORIESGO}

public class Coche {

    private int numBastidor;
    private String modelo;
    private String color;
    private boolean metalizado;
    private tipo_coche tipo;
    private modo_seguro seguro;


    public Coche(int numBastidor, String modelo, String color, boolean metalizado, tipo_coche tipo, modo_seguro seguro) {
        this.numBastidor = numBastidor;
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.tipo = tipo;
        this.seguro = seguro;
    }


    public Coche(Coche coche1) {
        this.modelo = coche1.modelo;
        this.color = coche1.color;
        this.metalizado = coche1.metalizado;
        this.tipo = coche1.tipo;
        this.seguro = coche1.seguro;
    }

    public Coche() {

    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMetalizado() {
        return metalizado;
    }

    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public tipo_coche getTipo() {
        return tipo;
    }

    public void setTipo(tipo_coche tipo) {
        this.tipo = tipo;
    }

    public modo_seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(modo_seguro seguro) {
        this.seguro = seguro;
    }
}
