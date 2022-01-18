package com.company.Segunda_Evaluacion.arrays;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;
    private int calif;

    public Libro(String titulo, String autor, int paginas, int calif) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.calif = calif;


    }


    public static void main(String[] args) {

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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }

    public void infoLibro(){

        System.out.println("Titulo: "+titulo+
                "Autor: "+autor+
                "Paginas: "+paginas+
                "Calificacion: "+calif);

    }
}


