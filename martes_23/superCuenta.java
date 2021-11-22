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


}
