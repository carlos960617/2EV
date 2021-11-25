package com.company.repaso_clase;

public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro(){}

    public Libro(String titulo, String autor, int ejemplares, int prestados){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {

        this.prestados += prestados;
    }

    public boolean prestamo (){

        if(ejemplares<1){
            System.out.println("Lo siento, no quedan libros.");
            return false;
        }else{setPrestados(1);
        return true;}

    }

    public boolean devolucion(){
        if(prestamo()){

            setPrestados(-1);
            return true;

        }else{return false;}
    }

    public String toString(){

        return null;
    }
}
