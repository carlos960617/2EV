package com.company.Primera_Evaluacion.condiconales_y_whiles.martes_23;

public class superCuenta {

    //private los atributos para que se tengan

    public static class Cuenta {
        private String cliente= "";
        private String nCuenta= "";
        private double tInteres= 0.0;
        private double saldo = 0.0;

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

        //ingreso y reintegro no se utilizaban a lo largo del programa porque se pueden utilizar en transferencia:

        /*
        public void Transferencia(Cuenta cDestino, double importe){
            if(reintegro(cantidad){
                cDestino.ingreso(cantidad);
                return true;
            }else{
                System.out.println("La cuenta origen no dispone de suficiente saldo.");
            }
        }
        * */

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
