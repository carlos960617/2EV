package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

public class Calculadora {

    double primerNumero;
    double segundoNumero;

    public double getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    //

    public double getResultadoSuma(){
        return primerNumero + segundoNumero;
    }

    public double getResultadoResta(){
        return segundoNumero - primerNumero;
    }

    public double getMultiplicationResult(){
        return segundoNumero * primerNumero;
    }

    public double getDivisionResult(){
        if(segundoNumero == 0){
            return 0.0;
        }else{return primerNumero/segundoNumero;}
    }


}
