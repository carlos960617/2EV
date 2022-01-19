package com.company.Segunda_Evaluacion.arrays.Viernes21;

public class Cuenta {

    private String banco;
    private long IBAN;
    private int saldo;

    public Cuenta(String banco1, long IBAN1){

        saldo = 0;
        banco = banco1;
        IBAN = IBAN1;

    }


    public Cuenta(String banco1, long IBAN1, int saldo1) {
        this.banco = banco1;
        this.IBAN = IBAN1;
        this.saldo = saldo1;
    }


    public int getSaldo() {
        return saldo;
    }


    public long getIBAN() {
        return IBAN;
    }

    public void abono(int pago){

        saldo += pago;
    }

    public void pagos(int recibo){

        /*if(recibo <= saldo){
            saldo -= recibo;
        }else{
            System.out.println("No tienes saldo suficiente para realizar el pago");
        }*/

        saldo -= recibo;
    }

    public boolean saldoNeg(){

        return saldo < 0;
    }

    public void transfer(Cuenta cuenta2, int pago){

        saldo -= pago;
        cuenta2.saldo += pago;

    }

}
