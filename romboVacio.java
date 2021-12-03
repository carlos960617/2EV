package com.company;

public class romboVacio {

    public static void main(String[] args) {

        int ancho = 7;

        for(int i=0;i<ancho;i++){
            for(int j=0; j<ancho; j++){
                if((j==(ancho/2)-j ||j==((ancho/2)+j))  && j==i){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }


            }

            System.out.println(" ");
        }

        /*for(j=0;j<ancho;){
                if(i== 0 && j== ancho/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                if(i==1 && j==(ancho/2)+1 || j==(ancho/2)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                if(i==2 && j==(ancho/2)+2 || j==(ancho/2)-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            j++;*/
    }
}
