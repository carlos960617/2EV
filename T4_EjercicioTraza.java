package com.company;

public class T4_EjercicioTraza {

    public static void main(String[] args) {

        double x,y;
        x=15.0;
        System.out.println("X vale siempre= "+x);
        y=10.0;
        System.out.println("Y vale siempre="+y);
        System.out.println("Calculamos Var1 dividiendo x/4 + 1 y redondeamos a la baja= ");
        int var1 =(int) ((x/4)+1);
        System.out.println("Var1 = "+var1+".");
        System.out.println("Calculamos Var2 dividiendo y/4 y redondeamos a la baja= ");
        int var2 = (int) (y/4);
        System.out.println("Var2 = "+var2+".");

        while (var1 > 0) {
            System.out.println("Mientras var1 sea mayor que cero:");
            var1 = var1-1;
            System.out.println("Restamos 1 a var1, siendo= "+var1);
            var2 = var2 * var1;
            System.out.println("Y multiplicamos var1 por var2, resultando= "+var2);
            System.out.print(var2 + "\n ");
        }
    }
}


