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
}
