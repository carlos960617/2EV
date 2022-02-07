package com.company.Segunda_Evaluacion.arrays.martes8;

import java.util.ArrayList;
import java.util.Scanner;

public class Coche {

    static Scanner sc = new Scanner(System.in);

    public String marca;
    public int km;

    public static void rellenaGaraje(ArrayList<Coche> garaje){

        System.out.println("Introduce el primer modelo");
        String marca=sc.nextLine();
        Coche cocheX;
        while(marca != "salir"){
            cocheX = new Coche();
            cocheX.marca = marca;
            System.out.println("Introduce su kilometraje");
            cocheX.km = sc.nextInt();
            garaje.add(cocheX);
            sc.nextLine();
            System.out.println("Siguiente coche(\"salir\" para acabar)");
        }
    }

    public static void muestraCoches(ArrayList<Coche> a){

        for(Coche C:a){
            System.out.println("Coche: "+C.marca+"\n" +
                    "Kilometraje: "+C.km);
            System.out.println("");
        }
    }

    public static void cochesMarcaX(ArrayList<Coche> a){
        System.out.println("Introduce de que marca quieres que se muestren los coches");
        String marcaX = sc.nextLine();
        for(Coche C:a){
            if(C.marca == marcaX )
            {
                System.out.println("Coche: "+C.marca+"\n" +
                        "Kilometraje: "+C.km);
                System.out.println("");

            }

        }
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public static void main(String[] args) {



        ArrayList<Coche> garaje = new ArrayList<>();

        rellenaGaraje(garaje);

        muestraCoches(garaje);

        cochesMarcaX(garaje);


    }

}
