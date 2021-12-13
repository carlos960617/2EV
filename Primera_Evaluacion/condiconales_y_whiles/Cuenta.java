package com.company.Primera_Evaluacion.condiconales_y_whiles;

import java.util.Scanner;

public class Cuenta {
    //primer declaramos las plantillas de todas las variables que va a necesitar nuestra clase
    String modelCliente;
    String modelIban;
    Double modelInteres;
    Double modelSaldo;
    Double modelIngreso;
    Double modelReintegro;
    Double importeTransferido;
    Scanner sc = new Scanner(System.in);

    public Cuenta() {}
    //creamos un constructor vacio para cuando creemos una instancia de la clase (objeto) sin argumentos y no de error (si no la creas tu java la crea por si mismo creo.
    public Cuenta(String cliente, String iban, Double interes, Double saldo) {
//creamos una clase con comportamiento por defecto cada vez que creamos un objeto de la clase con datos para los parametros
/*Como el constructor es la via de acceso para actualizar el contenido de las variables declaradas en la clase
en este asociamos el valor que se introduzca en los argumentos del objeto con el valor de las variables en la clase
para que el valor de estas se actualice y asi los metodos de la clase utilicen los nuevos valores.
 */
        modelCliente = cliente;
        modelIban = iban;
        modelInteres = interes;
        modelSaldo = saldo;

    }

    //falta constructor copia

    public void creaCliente(){this.modelCliente = sc.nextLine();}

    public void creaIban() {this.modelIban = sc.nextLine();}

    public void creaInteres() {this.modelInteres = sc.nextDouble();}

    public void creaSaldo(){this.modelSaldo = sc.nextDouble();}

    public void creaIngreso(){
        double ingreso = sc.nextDouble();
        modelIngreso = ingreso;
        if (ingreso < 1) {
            System.out.println("La cantidad a ingresar debe ser de 1 euro como mínimo.");
        }else{this.modelSaldo += ingreso;}
    }

    public void creaReintegro(){

        double reintegro = sc.nextDouble();
        modelReintegro = reintegro;
            if (reintegro > this.modelSaldo) {
                System.out.println("No puedes extraer mas dinero del que tienes.");
            }else{this.modelSaldo -= reintegro;}
    }

    public void creaTransferencia(Cuenta cuentaDestino){

        double importe = sc.nextDouble();
        this.importeTransferido = importe;
        if (importe > this.modelSaldo){
            System.out.println("La cuenta origen no dispone de tanto saldo");
        }else{this.modelSaldo -= importe; cuentaDestino.modelSaldo += importe;}
    }


    public static void main(String[] args) {


        Cuenta cuenta2 = new Cuenta();
        Cuenta cuenta1 = new Cuenta("Pepe", "ES01 24352", 10.0, 2450000.00);
        /*Cuenta cuentacopia = new Cuenta(cuenta1); //No se hacer constructores copia */



        System.out.println("Introduce el nombre del titular de la cuenta");

        cuenta2.creaCliente();


        System.out.println("La titularidad de la cuenta esta a nombre de "+ cuenta2.modelCliente + ".");
        System.out.println("Introduce tu IBAN:");
        cuenta2.creaIban();
        String IBANcuenta0 = cuenta2.modelIban;
        System.out.println("Tu numero de IBAN es " + IBANcuenta0 +".");
        System.out.println("Introduce el tipo de interes:");
        cuenta2.creaInteres();
        Double INTEREScuenta0 = cuenta2.modelInteres;
        System.out.println("El tipo de interes es de un "+ INTEREScuenta0+ ".");
        System.out.println("Introduce el saldo:");
        cuenta2.creaSaldo();
        Double SALDOcuenta2 = cuenta2.modelSaldo;
        System.out.println("El saldo en tu cuenta es de "+ SALDOcuenta2 + " euros.");
        System.out.println("Ingresa una cantidad:");
        cuenta2.creaIngreso();
        Double ingreso = cuenta2.modelIngreso; //¿como puedo acceder a la variable de un metodo?
        SALDOcuenta2 = cuenta2.modelSaldo;
        System.out.println("Has ingresado " + ingreso + " euros.\nAhora tienes "+ SALDOcuenta2 + ".");
        System.out.println("¿Cuato dinero quieres sacar de tu cuenta?");
        cuenta2.creaReintegro();
        Double REINTEGROcuenta0 = cuenta2.modelReintegro;
        SALDOcuenta2 = cuenta2.modelSaldo;
        System.out.println("Has retirado " + REINTEGROcuenta0 + " euros.\nTe quedan " + SALDOcuenta2 + " eurinchis.");
        System.out.println("Cuanto dinero quieres enviar a "+ cuenta1.modelCliente + "?");
        cuenta2.creaTransferencia(cuenta1);
        Double IMPORTEtransferido = cuenta2.importeTransferido;
        SALDOcuenta2 = cuenta2.modelSaldo;
        Double SALDOcuenta1 = cuenta1.modelSaldo;
        System.out.println("Se han transferido " + IMPORTEtransferido + " euros de " + cuenta2.modelCliente + " a " + cuenta1.modelCliente +".\n" +
                "La cuenta origen ahora tiene " + SALDOcuenta2 + "euros.\n" +
                "Y la cuenta destino ahora tiene"+ SALDOcuenta1 + " euros.");


        /*¿Como puedo crear una variable en MAIN que se actualice cada vez que modifico el contenido de modelSaldo?
        Por ejemplo SALDOcuenta2 sin tener que nombrarla constantemente?*/






    }
}
