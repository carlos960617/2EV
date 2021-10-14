

import java.util.Scanner;

public class Cambio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el importe del producto;");

        int precio = sc.nextInt();

        System.out.println("El precio del producto es "+ precio +" euros.\n" +
                "Introduce la cantidad en efectivo con la que vas a pagar:");

        int efectivo = sc.nextInt();

        System.out.println("Has pagado con " + efectivo + " euros.");

        //aquí obtenemos la cantidad que hay que fraccionar en billetes
        int cambio = efectivo - precio;

        //aquí se confirma si la cantidad a fraccionar es suficiente respecto al precio del producto
        String cambioValido = (efectivo < precio)?"Lo siento no tienes suficiente dinero":"Te sobran "+cambio+" euros.";

        System.out.println(cambioValido);

        //Si la cantidad contiene 500 euros o mas, devuelve tantos billetes de 500 como la cantidad contenga.

        String billetes500 = (cambio/500 >= 1)?"Te devuelvo "+cambio/500+" billete(s) de 500":"Vale";

        System.out.println(billetes500);

        //Aqui almacenamos la cantidad de billetes de 500 que contiene el cambio
        int billetesParaRestar = cambio/500;

        //Aquí restamos la cantidad en billetes de 500 a la cantidad de dinero recibida

        int cambio200 = cambio-(billetesParaRestar*500);

        //De nuevo averiguamos cuantos billetes de 200 caben en la cantidad que nos resta de la anterior

        String billetes200 = (cambio200/200 >= 1)?"Te devuelvo "+cambio200/200+" billete(s) de 200":"Veamos";

        System.out.println(billetes200);

        billetesParaRestar = cambio200/200;

        //Al cambio con los posibles de 500 restados, le restamos los posibles de 200 que haya.

        int cambio100 = cambio200-(billetesParaRestar*200);

        String billetes100 = (cambio100/100 >= 1)?"Te devuelvo "+cambio100/100+ " billete(s) de 100":"Aha...";

        System.out.println(billetes100);

        //Calculo cuantos billetes de 100 hay en el cambio sin los de 500 ni los de 200

        billetesParaRestar = cambio100/100;

        //Le resto el dinero que haya en X billetes de 100 al cambio sin los de 500 ni 200
        int cambio50 = cambio100-(billetesParaRestar*100);

        String billetes50 = (cambio50/50 >= 1)?"Te devuelvo "+cambio50/50+ " billete(s) de 50":"Sí, sí, sí...";

        System.out.println(billetes50);

        billetesParaRestar = cambio50/50;

        int cambio20 = cambio50-(billetesParaRestar*50);

        String billetes20 = (cambio20/20 >= 1)?"Te devuelvo "+cambio20/20+ " billete(s) de 20":"¡Entonces!";

        System.out.println(billetes20);

        billetesParaRestar = cambio20/20;

        int cambio10 = cambio20-(billetesParaRestar*20);

        String billetes10 = (cambio10/10 >=1)?"Te devuelvo "+cambio10/10+ " billete(s) de 10":"Creo que...";

        System.out.println(billetes10);

        billetesParaRestar = cambio10/10;

        int cambio5 = cambio10-(billetesParaRestar*10);

        String billetes5 = (cambio5/5 >=1)?"Te devuelvo "+cambio5/5+ " billete(s) de 5":"¡Hm!";

        System.out.println(billetes5);

        billetesParaRestar = cambio5/5;

        int cambioEnMonedas = cambio5-(billetesParaRestar*5);

        String monedas = (cambioEnMonedas/1 >=1)?"Te devuelvo "+cambioEnMonedas/1+ " euro(s).":"Y ya está.";

        System.out.println(monedas);

        System.out.println("Te devuelvo ");


       /* if (cambio >= 500){int billetes = cambio/500;}

        if(cambio%500 != 0 ){int billetesmenoresde500 = cambio%500;}*/

    }
}
