package com.company.martes_23;

import java.util.Scanner;

public class superCuenta {

    public static class Cuenta {
        String cliente= "";
        String nCuenta= "";
        double tInteres= 0.0;
        double saldo = 0.0;

        public Cuenta(){}

        public Cuenta(String c, String n, double tInt, double s){
            cliente = c;
            nCuenta = n;
            tInteres = tInt;
            saldo = s;
        }

        public Cuenta (Cuenta cuentaC){

            cliente = cuentaC.cliente;
            nCuenta = cuentaC.nCuenta;
            tInteres = cuentaC.tInteres;
            saldo = cuentaC.saldo;



        }

        /*Como la copia de cuenta1 a cuenta3 se hace
        * antes del ingreso, luego cuenta3 no refleja el saldo
        * actualizado de cuenta1*/

        public boolean Ingreso(double add){
            if(add>0){
                saldo += add;
                return true;
            }else{return false;}
        }

        public boolean Reintegro(double draw){
            if(saldo>=draw) {
                saldo -= draw;
                return true;
            }else{return false;}
        }

        public void Transferencia(Cuenta cDestino, double importe){
            if(saldo >= importe){
                saldo -= importe;
                cDestino.saldo += importe;
            }else{
                System.out.println("La cuenta origen no dispone de suficiente saldo.");
            }
        }

        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public String getnCuenta() {
            return nCuenta;
        }

        public void setnCuenta(String nCuenta) {
            this.nCuenta = nCuenta;
        }

        public double gettInteres() {
            return tInteres;
        }

        public void settInteres(double tInteres) {
            this.tInteres = tInteres;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de cuenta");

        cuenta1.nCuenta = sc.nextLine();

        System.out.println("Introduce el titular de la cuenta");

        cuenta1.cliente = sc.nextLine();

        System.out.println("Introduce el tipo de interes");

        cuenta1.tInteres = sc.nextDouble();

        System.out.println("Por utlimo, introduce el saldo");

        cuenta1.saldo = sc.nextDouble();

        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        Cuenta cuenta3 = new Cuenta(cuenta1);

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
