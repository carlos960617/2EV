package com.company.viernes_26.floristeria;

import java.util.Scanner;

public class tramitacion {

    public static void main(String[] args) {

            /*Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM");
        String fechaActual = formatter.format(date);
        String mesActual = fechaActual.substring(3,5);
        String diaMes = fechaActual.substring(0,2);

        System.out.println(mesActual);*/

        Scanner sc = new Scanner(System.in);
        Ramos ramo1 = new Ramos();
        Pedidos pedido1 = new Pedidos();
        Envio envio1 = new Envio();

        System.out.println("Bienvenida a ramos a domicilio.");
        ramo1.setFlor();

        System.out.println("¿Cuantas flores quieres que tenga tu ramo? Puede tener de 1 a 50 flores");

        ramo1.setCantidad(sc.nextInt());

        System.out.println("¿Quieres que te lo envolvamos para regalo? (true = sí , false = no)");
        ramo1.esRegalo(sc.nextBoolean());

        if(ramo1.getRegalo()){
            System.out.println("Introduce la dedicatoria que quieras añadir a tu regalo");
            ramo1.setDedicatoria();
        }else{
            System.out.println("No hay problema.");
        }

        System.out.println("¿Tienes algun descuento por haber comprado anteriormente? (true = sí , false = no)");

        if(sc.nextBoolean()){
            System.out.println("Introduce la cantidad a descontar");
            pedido1.setDescuento(sc.nextDouble());
        }else{
            System.out.println("No hay problema");
        }

        System.out.println("¿A qué dirección quieres que enviemos el ramo?");

        envio1.setDireccion();

        System.out.println("¿A cuantos km se encuentra el domicilio de nuestras oficinas?");

        envio1.setDistancia(sc.nextInt());

        System.out.println("Por favor, proporcione un telefono de contacto (9 digitos)");

        pedido1.setContacto(sc.nextLine());

        envio1.setCosteKm();

        pedido1.setPlazo(ramo1);

        ramo1.setPrecio();


        pedido1.setPrecioFinal(envio1, ramo1);

        System.out.println("¡PERFECTO! Estos son los  datos de la entrega:\n" +
                "Telefono de contacto:"+pedido1.getContacto()+"\n" +
                "Direccion de envio:"+ envio1.getDireccion()+"\n"+
                "Composicion del ramo: "+ ramo1.getFlor()+ "\n" +
                "Cantidad de flores: "+ramo1.getCantidad()+ "\n" +
                "Envoltura para regalo: "+ ramo1.getRegalo()+ "\n" +
                "Mensaje personalizado: '"+ ramo1.getDedicatoria()+"'\n"+
                "Precio final:"+pedido1.getPrecioFinal()+ " euros\n" +
                "Plazo de entrega:"+pedido1.getPlazoEtrega()+" días.");

        System.out.println("¿Está todo correcto? (true = sí , false = no)");

        boolean ans = sc.nextBoolean();

        if(ans){
            System.out.println("Perfecto, gracias por confiar en nosotros. ¡Hasta pronto!");
        }else{
            System.out.println("Lo siento, se ha acabado el tiempo, vuelva a contactarnos si quiere modificar su pedido. ¡Hasta pronto!");
        }
    }
}
