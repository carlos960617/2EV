package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

public class Muro {

    private double ancho = 0;
    private double alto = 0;

    public Muro(){}

    public Muro(double ancho1, double alto1){

        if(ancho1 < 0){ancho1 = 0;}
        if(alto1 < 0){alto1 = 0;}
        ancho = ancho1;
        alto = alto1;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {

        if(ancho < 0){ancho = 0;}
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if(alto < 0){alto = 0;}
        this.alto = alto;
    }

    public double getArea(){
        return ancho * alto;
    }

    public static void main(String[] args) {

        Muro muro = new Muro(5,4);
        System.out.print("area=" + muro.getArea());
        muro.setAlto(-1.5);
        System.out.print("  ancho=" + muro.getAncho());
        System.out.print("  alto=" + muro.getAlto());
        System.out.println("  area=" + muro.getArea());



    }
}
