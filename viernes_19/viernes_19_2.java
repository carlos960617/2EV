package com.company.viernes_19;

import java.util.Scanner;

public class viernes_19_2 {

    public static class Persona{

        /* No puedo instanciar nombre y apellidos como vacios porque
        * isEmpty() no contempla null, contempla string vacia*/
        String nombre="";
        String apellido="";
        int edad;


        public String getNombre() {

            if(nombre.isEmpty()){
                nombre = apellido;
            }
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        //conforme estaba redactado el enunciado las validaciones de getNombre y getApellido deberían ir en getFullName

        public String getApellido() {

            if(apellido.isEmpty()){
                apellido = nombre;
            }
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {

            if(edad<0 || edad>100){
                edad = 0;
            }
            this.edad = edad;

        }

        public boolean esAdolescente(){
            return this.edad > 12 && this.edad < 20;
        }

        //tienen que ser public o private? static.. o no?

        public String getFullName(){

            if(nombre.isEmpty() && apellido.isEmpty()){
                nombre= "";
                apellido= "";
                return nombre+apellido;
            }
            return nombre+" "+apellido;
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona test = new Persona();

        Persona test2 = new Persona();

        Persona test3 = new Persona();

        test.setNombre("Lorena");

        test.setApellido("Ramirez");

        test.setEdad(25);

        String testFullName= test.getFullName();

        boolean testesAdolescente = test.esAdolescente();

        int testEdad = test.getEdad();

        String testName = test.getNombre();

        String testSur = test.getApellido();

        System.out.println("A continuacion mostramos los datos de tu usuario de prueba:\n" +
                "Nombre:"+testName+"\n" +
                "Edad:"+testEdad+"\n" +
                "Apellidos:"+testSur+"\n" +
                "Nombre Completo:"+testFullName+"\n"+
                "Es Adolescente:"+testesAdolescente+"\n");

        test2.setApellido("Pastor");

        System.out.println("Nombre Vacío debe devolver apellido: "+test2.getNombre());

        test3.setNombre("");
        test3.setApellido("");
        test3.setEdad(10);

        System.out.println("fullName="+test3.getFullName());
        System.out.println("adolescente="+test3.esAdolescente());

        test3.setNombre("Ana");
        test3.setEdad(18);
        System.out.println("fullName= "+test3.getFullName());
        System.out.println("adolescente= "+test3.esAdolescente());
        test3.setApellido("Guerrero");
        System.out.println("fullName= "+test3.getFullName());




    }
}
