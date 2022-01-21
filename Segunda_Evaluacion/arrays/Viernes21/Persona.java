package com.company.Segunda_Evaluacion.arrays.Viernes21;

public class Persona {

    private String DNI;
    private Cuenta[] cuenta= new Cuenta[3];




    public void nuevaCuenta(Cuenta cuentaAdd){

        boolean ubicado = false;


        for(int i = 0; i< cuenta.length && !ubicado; i++){
            if(cuenta[i] == null){
                cuenta[i] = cuentaAdd;
                ubicado = true;
            }
        }

    }

    public boolean morosidad(){

        boolean esMoroso = false;

        for (Cuenta sospechosa : cuenta) {
            if (sospechosa != null) {
                esMoroso =  sospechosa.saldoNeg();
            }
        }
        return esMoroso;

        /*Porqué no me dejá meter el return unicamente dentro del if y asi ahorrarme esMoroso?*/
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Cuenta[] getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta[] cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString(){

        String s1 = "DNI= "+DNI+"\n" +
                "Cuentas Asociadas:\n";

        String s2 = "";

        for(int i=0, j=1; i<cuenta.length;i++, j++){
            if(cuenta[i] != null){

                s2 +=
                        "Cuenta "+j+": "+ cuenta[i].getBanco()+"\n" +
                        "IBAN: "+cuenta[i].getIBAN()+"\n" +
                        "SALDO: "+cuenta[i].getSaldo();

            }
        }

        String s3 = "Morosidad";

        if(morosidad()){
            s3 = "\u001B[31m Es moroso\033[0;100m";
        }else{
            s3 = "No es moroso";
        }

        return s1 + s2 +"\n"+ s3;

    }
}
