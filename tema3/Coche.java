package com.company.tema3;

enum tipoCoche {mini, utilitario, familiar, deportivo}
enum seguro {terceros, todoRiesgo}

public class Coche {
    String modelo;
    String color;
    boolean metalizado;
    String matricula;
    enum tipoCoche{};
    int anyoFabricacion;
    enum seguro{};

    public Coche(){}

    public Coche(String modelo1, String color1){
        modelo = modelo1;
        color = color1;
    }

    public void imprimecoche (Coche coche1){
        if (coche1.color != null && coche1.modelo != null){
            System.out.println("El coche "+coche1.modelo+" es de color "+coche1.color+".");
        }
    }

    public static void main(String[] args) {

        Coche miCoche = new Coche();
        Coche coche2 = new Coche();

        coche2.imprimecoche(miCoche);

    }

}
