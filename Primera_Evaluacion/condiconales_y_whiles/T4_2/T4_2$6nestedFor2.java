package com.company.Primera_Evaluacion.condiconales_y_whiles.T4_2;

public class T4_2$6nestedFor2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j < i; j++) {
                if(i == 4)
                    break;
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
