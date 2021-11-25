package com.company.repaso_clase;

enum tipoVip{GOLD, SILVER, NORMAL}

public class ClienteVip {

        private String nombre = "";
        private double limiteCredito = 0;
        private String email ="";
        private tipoVip vipLevel;



        public ClienteVip(){}

        public ClienteVip(String n, String e){
            nombre = n;
            email = e;
            /*Hemos elegido este valor por defecto pero podría ser cualquiera
            Incluso null*/
            vipLevel = tipoVip.GOLD;

        }

        public ClienteVip(String n, double lc, String e, tipoVip tv){

            nombre = n;
            email = e;
            limiteCredito = lc;
            vipLevel= tv;

        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getLimiteCredito() {
            return limiteCredito;
        }

        public void setLimiteCredito(double limiteCredito) {
            this.limiteCredito = limiteCredito;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public static void main(String[] args) {

            ClienteVip cliente1 = new ClienteVip();

            System.out.println();



        }

    }
