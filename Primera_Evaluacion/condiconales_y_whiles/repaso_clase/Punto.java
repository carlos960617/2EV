package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

public class Punto {

    private int x;
    private int y;

    public Punto(){}

    public Punto(int x1, int y1){
        x= x1;
        y = y1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(){
        return Math.sqrt(x*x+y*y);
    }

    public double distancia(int x1, int y1){

        return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));

    }

    public double distancia(Punto otro){

        return Math.sqrt((otro.getX()-x)*(otro.getX()-x)+(otro.getY()-y)*(otro.getY()-y));

    }



    public static void main(String[] args) {

        Punto primero = new Punto(6, 5);
        Punto segundo = new Punto(3, 1);
        System.out.println("distancia(0,0)= " + primero.distancia());
        System.out.println("distancia(segundo)= " + primero.distancia(segundo));
        System.out.println("distancia(2,2)= " + primero.distancia(2, 2));
        Punto punto = new Punto(); System.out.println("distancia()= " + punto.distancia());





    }
}
