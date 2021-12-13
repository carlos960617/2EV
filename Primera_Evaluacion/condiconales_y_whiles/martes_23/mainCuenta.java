package com.company.Primera_Evaluacion.condiconales_y_whiles.martes_23;

import java.util.Scanner;

import com.company.Primera_Evaluacion.condiconales_y_whiles.martes_23.superCuenta.Cuenta;

//si estubiese en un paquete diferente habria que importar el paquete donde esta la clase: import.nombrepaquete.nombreClase;

public class mainCuenta {
    public static void main(String[] args) {

        Cuenta cuenta1 = new superCuenta.Cuenta();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de cuenta");

        cuenta1.setnCuenta(sc.nextLine());

        System.out.println("Introduce el titular de la cuenta");

        cuenta1.setCliente(sc.nextLine());

        System.out.println("Introduce el tipo de interes");

        cuenta1.settInteres(sc.nextDouble());

        System.out.println("Por utlimo, introduce el saldo");

        cuenta1.setSaldo(sc.nextDouble());

        Cuenta cuenta2 = new superCuenta.Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        Cuenta cuenta3 = new superCuenta.Cuenta(cuenta1);

        System.out.println("Datos Cuenta1\n" +
                "Titular="+cuenta1.getCliente()+".\n" +
                "Numero="+cuenta1.getnCuenta()+".\n" +
                "Interes="+cuenta1.gettInteres()+".\n" +
                "Saldo="+cuenta1.getSaldo()+".");

        System.out.println("Realiza un ingreso en la Cuenta1");

        double add1 = sc.nextDouble();

        cuenta1.Ingreso(add1);

        System.out.println("Cuenta 1\n" +
                "Saldo="+cuenta1.getSaldo()+".");


        System.out.println("Datos Cuenta2\n" +
                "Titular="+cuenta2.getCliente()+".\n" +
                "Numero="+cuenta2.getnCuenta()+".\n" +
                "Interes="+cuenta2.gettInteres()+".\n" +
                "Saldo="+cuenta2.getSaldo()+".");


        System.out.println("Datos Cuenta3\n" +
                "Titular="+cuenta3.getCliente()+".\n" +
                "Numero="+cuenta3.getnCuenta()+".\n" +
                "Interes="+cuenta3.gettInteres()+".\n" +
                "Saldo="+cuenta3.getSaldo()+".");

        cuenta3.Transferencia(cuenta2, 10);

        System.out.println("Cuenta 2\n" +
                "Saldo="+cuenta2.getSaldo()+".");

        System.out.println("Cuenta 3\n" +
                "Saldo="+cuenta3.getSaldo()+".");







    }

}
