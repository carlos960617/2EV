package com.company;

public class viernes12_3 {

    public static void main(String[] args) {

        int altura = 3;

        int anchura = 0;

        for(int i=0; i<=altura; i++){

            for(int j = 0; j<=anchura; j++){
                if (j%2 == 0){
                    System.out.print("* ");
                }else if(j==3){
                    System.out.print("0 * ");
                }else{
                    System.out.print("0 ");
                }
            }

            System.out.println(" ");
            anchura++;
        }

    }
}
