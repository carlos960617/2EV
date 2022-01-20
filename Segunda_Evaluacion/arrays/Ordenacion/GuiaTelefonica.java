package com.company.Segunda_Evaluacion.arrays.Ordenacion;

public class GuiaTelefonica {

    private EntradaTelefono[] guia;

    public GuiaTelefonica(){

        guia = new EntradaTelefono[5];

        EntradaTelefono usuario1 = new EntradaTelefono("Lorena", 664489806);
        EntradaTelefono usuario2 = new EntradaTelefono("Macarena", 663489866);
        EntradaTelefono usuario3 = new EntradaTelefono("Gimena", 664489861);
        EntradaTelefono usuario4 = new EntradaTelefono("Almudena", 664598667);
        EntradaTelefono usuario5 = new EntradaTelefono("Arena", 6644892);
    }

    public EntradaTelefono buscador(String nombre1){

        EntradaTelefono elemento = null;

        for(int i=0;i<guia.length;i++){

            if(guia[i] != null){
                if(nombre1.equals(guia[i].getNombre())){
                    elemento = guia[i];
                }
            }
        }


        return elemento;
    }
}
