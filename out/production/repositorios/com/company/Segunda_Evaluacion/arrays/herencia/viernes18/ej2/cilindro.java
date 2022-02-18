package com.company.Segunda_Evaluacion.arrays.herencia.viernes18;

public class cilindro extends circulo{

    public double altura;

    public cilindro(double altura, double radio){
        super(radio);
        if(altura < 0){
            this.altura = 0;
        }else{this.altura = altura;}
    }

    public double getAltura(){return altura;}

    public double getVolume(){return this.getArea()*altura;}

    @Override
    public double getArea(){return 2 * Math.PI * this.radio * altura + 2 * Math.PI * this.radio * this.radio;}


}
