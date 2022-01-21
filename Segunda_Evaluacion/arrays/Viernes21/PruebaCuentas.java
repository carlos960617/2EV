package com.company.Segunda_Evaluacion.arrays.Viernes21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PruebaCuentas {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setDNI("47838397Q");

        /*Porque no deja que IBAN sea mas largo si es de tipo long?*/

        Cuenta cuenta1 = new Cuenta("Bancos El Pastoret", 556464443);

        Cuenta cuenta2 = new Cuenta("Grupo Elementos", 343534543, 700);

        persona1.nuevaCuenta(cuenta1);

        persona1.nuevaCuenta(cuenta2);


        Cuenta[] cuentasP1 = persona1.getCuenta();

        cuentasP1[0].abono(1100);

        cuentasP1[1].pagos(750);

        System.out.println(persona1.morosidad());

        System.out.println(persona1);

        cuentasP1[0].transfer(cuenta2, 500);

        System.out.println(persona1);




    }
}
