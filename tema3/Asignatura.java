package com.company.tema3;

public class Asignatura {
    String nombre;
    int codigo;
    String curso;

    public Asignatura(String nombreInicial, int codigoInicial, String cursoInicial){
        nombre = nombreInicial;
        codigo = codigoInicial;
        curso = cursoInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }

    public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura("Matemáticas", 1017, "1");

        System.out.println("Estos son los datos de tu primera asignatura: \n" +
                "Nombre: "+ asignatura1.getNombre() + "\n" +
                "Codigo: "+asignatura1.getCodigo()+ "\n" +
                "Curso: "+asignatura1.getCurso());

    }
}
