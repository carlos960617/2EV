package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

import java.util.Scanner;

public class Fecha {
    //atributos
    int modelDia;
    int modelMes;
    int modelAnyo;

    //constructores
    public Fecha(){}
    public Fecha(int dia, int mes, int anyo){
        modelDia = dia;
        modelMes = mes;
        modelAnyo = anyo;

    }

    public Fecha(Fecha FechaF){
        modelDia = FechaF.modelDia;
        modelMes = FechaF.modelMes;
        modelAnyo = FechaF.modelAnyo;

    }

    public int getDia() {
        return modelDia;
    }

    public void setDia(int dia) {
        modelDia = dia;
    }

    public int getMes() {
        return modelMes;
    }

    public void setMes(int mes) {
        modelMes = mes;
    }

    public int getAnyo() {
        return modelAnyo;
    }

    public void setAnyo(int anyo) {
        modelAnyo = anyo;
    }

    public void infoFecha(){
        System.out.println("La fecha es: Dia: "+modelDia+" Mes: "+modelMes+" Año: "+modelAnyo+".");
    }

    private boolean esBisiesto(){
        boolean esBis;
        esBis = (modelAnyo%4 == 0) && (modelAnyo%100 !=0)||(modelAnyo%400 == 0);
        return esBis;
    }
    //Revisa esto xD
    public boolean fechaCorrecta(){
        boolean diacorrecto, mescorrecto, anyocorrecto;

        anyocorrecto = (modelAnyo>0);
        mescorrecto = (modelMes>=1 && modelMes<=12);
        if (modelMes == 2){ //¿Que pasa si el usuario inserta un int que es 02 en lugar de 2?
            if (esBisiesto()){
                diacorrecto = (modelDia>=1 && modelDia<=29);
            }else
                diacorrecto = (modelDia>=1 && modelDia<=28);
        } else if (modelMes==1 || modelMes==3 || modelMes==5|| modelMes==7|| modelMes==8|| modelMes==10|| modelMes==12) {
            diacorrecto = (modelDia>=1 && modelDia<=31); //¿Porque dice que siempre es true?
        }else{diacorrecto = (modelDia>=1 && modelDia<=30);
        }

        return diacorrecto && mescorrecto && anyocorrecto;
    }

    public static void main(String[] args) {
        Fecha fechaVacia = new Fecha();
        System.out.println(fechaVacia);

        Fecha fechaActual = new Fecha(15, 10, 2021);
        System.out.println(fechaActual);

        fechaActual.infoFecha();

        //leer si una fecha introducida por teclado es correcta

        Scanner sc = new Scanner(System.in);

        int diaDado = sc.nextInt();
        int mesDado = sc.nextInt();
        int anyoDado = sc.nextInt();

        System.out.println("Dia: "+diaDado+". Mes: "+mesDado+". Anyo "+anyoDado+".");

        Fecha fechanueva = new Fecha(diaDado, mesDado, anyoDado);

        if(fechanueva.fechaCorrecta()){
            System.out.println("La fecha introducida es correcta.");
        }else {
            System.out.println("La fecha es incorrecta");
        }
    }
}
