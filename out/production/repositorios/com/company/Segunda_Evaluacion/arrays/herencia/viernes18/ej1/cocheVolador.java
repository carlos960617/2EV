package com.company.Segunda_Evaluacion.arrays.herencia.viernes18;

public class cocheVolador extends coche{

    public int numAlas;
    public boolean transformable;
    public String maxAltura;
    public boolean paraRayos;
    public boolean aterrizajeAutomatico;


    public cocheVolador(String ubicacion, String parking, boolean automatico, boolean ABS, String matricula, int maxSpeed, double antiguedad, String color, double peso, int velocidadActual, boolean transformable, String maxAltura, boolean paraRayos, boolean aterrizajeAutomatico, int numAlas) {
        super(ubicacion, parking, automatico, ABS, matricula, maxSpeed, antiguedad, color, peso, velocidadActual);
        this.transformable = transformable;
        this.maxAltura = maxAltura;
        this.paraRayos = paraRayos;
        this.aterrizajeAutomatico = aterrizajeAutomatico;
        this.numAlas= numAlas;
    }

    @Override
    public void leerUbicacion(int ejeY, int ejeX, int ejeZ){

        this.ubicacion = Integer.toString(ejeX+ejeY+ejeY+ejeZ);

        System.out.println("El coche volador está ubicado en:\n" +
                "Km "+ ejeY +" del eje Y\n" +
                "Km "+ejeX+" del eje X\n" +
                "Km "+ejeZ+" del eje Z");


    }



}
