package com.company.Segunda_Evaluacion.arrays.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClase5 {

    public void obtenerArrListSinCadenasRepetidas(ArrayList<String> a){
        //arrayList.remove() elimina y reorganiza indices
        String aux;
        for(int i=0;i<a.size()-1;i++){
            aux = a.get(i);
            for(int j=0;j<a.size()-1;j++){
                if(aux == a.get(j) && i!=j){
                    a.remove(j);
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<>();
        System.out.println("Introduce tu primer array");
        String linea = sc.nextLine();
        while(linea != "salir"){
            a.add(sc.nextLine());
            System.out.println("Siguient array");
            linea=sc.nextLine();
        }


    }
}
