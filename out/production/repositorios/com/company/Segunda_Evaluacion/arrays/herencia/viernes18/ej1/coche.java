package com.company.Segunda_Evaluacion.arrays.herencia.viernes18;

public class coche extends vehiculo {

    public String parking;
    public boolean automatico;
    public boolean ABS;
    public String ubicacion;

    public coche (String ubicacion, String parking, boolean automatico, boolean ABS, String matricula, int maxSpeed, double antiguedad, String color, double peso, int velocidadActual ){
        super(matricula, maxSpeed, antiguedad, color, peso, velocidadActual);
        this.parking = parking;
        this.automatico = automatico;
        this.ABS = ABS;
        this.ubicacion = ubicacion;

    }

    public void leerUbicacion(int ejeY, int ejeX, int ejeZ){
        ubicacion = Integer.toString(ejeY+ejeX);

        System.out.println("El coche está ubicado en el km "+ ejeY +" del eje Y y en el km "+ejeX+" del eje X");

    }


}
