package com.company.Primera_Evaluacion.condiconales_y_whiles.repaso_clase;

enum color_semaforo {rojo,ambar,verde;

    public static class ProgSemaforo {

        public static void main(String[] args) {
            Semaforo misemaforo = new Semaforo();
            System.out.println("Creación de la clase Semaforo (solo propiedades)");
            System.out.println("");

            System.out.println("Ampliación de la clase Semaforo (añadimos métodos set y get), inserción de datos y extracción de datos");
            System.out.println("El color del semáforo es: "+misemaforo.getColor());
            if (!misemaforo.isParpadea())
                System.out.println(" Y no está parpadeando");
            misemaforo.setColor(ambar);
            System.out.println("El color del semáforo es: "+misemaforo.getColor());
            if (misemaforo.isParpadea())
                System.out.println(" Y está parpadeando");

            System.out.println("");
        }
    }
};

public class Semaforo {

    private color_semaforo color = color_semaforo.rojo;
    private boolean parpadea = false;

    public void setColor(color_semaforo color) {
        this.color = color;
        if (color == color_semaforo.ambar)
            this.parpadea = true;
    }

    public color_semaforo getColor() {
        return color;
    }

    public boolean isParpadea() {
        return parpadea;
    }

    public void setParpadea(boolean parpadea) {
        this.parpadea = parpadea;
    }

}
