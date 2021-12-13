package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

public class romboVacio {

    public static void main(String[] args) {

        int n = 7;
        int a;
        int b;
        int y = 0;

        for(int i= 0;i<=n/2;i++){
            a = n/2+y;
            b = n/2-y;
            for(int j = 0;j<n;j++){
                if(j==b || j==a){
                    System.out.print("* ");

                }else{
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
           y++;
        }

        y=2;

        for(int i= 0;i<n/2;i++){
            a = n/2+y;
            b = n/2-y;
            for(int j = 0;j<n;j++){
                if(j==b || j==a){
                    System.out.print("* ");

                }else{
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
            y--;
        }



    }
}
