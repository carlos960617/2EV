package com.company.Segunda_Evaluacion.arrays.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClase4 {

    static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> obtenerArrCad5Vocales (ArrayList<String> a){

        ArrayList<String> cadenaCon5 = new ArrayList<>();

        int count = 0;
        boolean aCheck = false, eCheck = false;
        boolean iCheck= false;
        boolean oCheck= false;
        boolean uCheck= false;
        for(String c: a){
            for(int i=0;i<c.length();i++){
                if(c.charAt(i) == 'a'){
                    aCheck=true;
                }else if(c.charAt(i) == 'e'){
                    eCheck=true;
                }else if(c.charAt(i) == 'i'){
                    iCheck=true;
                }else if(c.charAt(i) == 'o'){
                    oCheck=true;
                }else if( c.charAt(i) == 'u'){
                    uCheck=true;
                }

                }
            if(aCheck && eCheck && iCheck && oCheck && uCheck) {
                cadenaCon5.add(c);
            }
            aCheck = false;eCheck = false;iCheck = false;oCheck = false;uCheck = false;

        }


        return cadenaCon5;

    }

    public static void leerArray(ArrayList<String> a){

        System.out.println("Introduce tu primera cadena");

        String cadena = sc.nextLine();

        while(!cadena.equalsIgnoreCase("FIN")){
            a.add(cadena);
            System.out.println("Siguient cadena. (FIN para salir)");
            cadena=sc.nextLine();
        }
    }

    public static void main(String[] args) {

        ArrayList<String> cadena = new ArrayList<>();

        leerArray(cadena);

        ArrayList<String> solo5 = obtenerArrCad5Vocales(cadena);

        System.out.println(solo5);




    }
}
