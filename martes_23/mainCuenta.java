package com.company.martes_23;

import java.util.Scanner;

public class mainCuenta {
    public static void main(String[] args) {

        superCuenta.Cuenta cuenta1 = new superCuenta.Cuenta();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de cuenta");

        cuenta1.nCuenta = sc.nextLine();

        System.out.println("Introduce el titular de la cuenta");

        cuenta1.cliente = sc.nextLine();

        System.out.println("Introduce el tipo de interes");

        cuenta1.tInteres = sc.nextDouble();

        System.out.println("Por utlimo, introduce el saldo");

        cuenta1.saldo = sc.nextDouble();

        superCuenta.Cuenta cuenta2 = new superCuenta.Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        superCuenta.Cuenta cuenta3 = new superCuenta.Cuenta(cuenta1);

        System.out.println("Datos Cuenta1\n" +
                "Titular="+cuenta1.cliente+".\n" +
                "Numero="+cuenta1.nCuenta+".\n" +
                "Interes="+cuenta1.tInteres+".\n" +
                "Saldo="+cuenta1.saldo+".");

        System.out.println("Realiza un ingreso en la Cuenta1");

        double add1 = sc.nextDouble();

        cuenta1.Ingreso(add1);

        System.out.println("Cuenta 1\n" +
                "Saldo="+cuenta1.saldo+".");


        System.out.println("Datos Cuenta2\n" +
                "Titular="+cuenta2.cliente+".\n" +
                "Numero="+cuenta2.nCuenta+".\n" +
                "Interes="+cuenta2.tInteres+".\n" +
                "Saldo="+cuenta2.saldo+".");


        System.out.println("Datos Cuenta3\n" +
                "Titular="+cuenta3.cliente+".\n" +
                "Numero="+cuenta3.nCuenta+".\n" +
                "Interes="+cuenta3.tInteres+".\n" +
                "Saldo="+cuenta3.saldo+".");

        cuenta3.Transferencia(cuenta2, 10);

        System.out.println("Cuenta 2\n" +
                "Saldo="+cuenta2.saldo+".");

        System.out.println("Cuenta 3\n" +
                "Saldo="+cuenta3.saldo+".");







    }

}
