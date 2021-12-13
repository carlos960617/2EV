package com.company.Primera_Evaluacion.condiconales_y_whiles.martes_30;

import java.util.Scanner;

public class Profesor {

    Scanner sc = new Scanner(System.in);

    private static double costeExtra;
    private static int plantilla;
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int totalExtra;
    private double IRPF;

    public Profesor(){

        setPlantilla(1);

    }

    public Profesor(String dni1, String nombre1, double sB, int tE, double IRPF1){
        dni = dni1;
        nombre = nombre1;
        sueldoBase = sB;
        totalExtra = tE;
        IRPF = IRPF1;

        setPlantilla(1);

    }

    public double calcularImporteHorasExtra(){
        return totalExtra * costeExtra;
    }

    public double calcularSueldoBruto(){
        return sueldoBase + calcularImporteHorasExtra();
    }

    public double calcularRetencionIrpf(){
        return (calcularSueldoBruto() * IRPF)/100;
    }

    public double calcularSueldo(){
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }

    @Override
    public String toString(){

        if(calcularImporteHorasExtra() == 20){
            return dni +" "+ nombre +" Sueldo Base: "+ sueldoBase+"\n" +
                    "\n" +
                    "Horas Extras: "+totalExtra+"\n" +
                    "tipo IRPF"+IRPF+"\n" +
                    "\n" +
                    "Sueldo Bruto:"+calcularSueldoBruto()+"\n" +
                    "Retencion por IRPF:"+calcularRetencionIrpf()+"\n" +
                    "Sueldo Neto:"+calcularSueldo();
        }else{return "El importe no es el adecuado";}
    }

    public void leerProfesores(){

        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println(" DNI: ");
        dni = sc.nextLine();
        System.out.println("\n Sueldo Base: ");
        sueldoBase = sc.nextDouble();
        System.out.println("Horas Extras: ");
        totalExtra = sc.nextInt();
        System.out.println("\n Tipo IRPF: ");
        IRPF = sc.nextDouble();

    }

    public static double getCosteExtra() {
        return costeExtra;
    }

    public static void setCostExtra(double costeExtra) {
        Profesor.costeExtra = costeExtra;
    }

    public static int getPlantilla() {
        return plantilla;
    }

    public static void setPlantilla(int plantilla) {
        Profesor.plantilla += plantilla;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getTotalExtra() {
        return totalExtra;
    }

    public void setTotalExtra(int totalExtra) {
        this.totalExtra = totalExtra;
    }

    public double getIRPF() {
        return IRPF;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }
}
