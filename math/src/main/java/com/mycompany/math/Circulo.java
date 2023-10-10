package com.mycompany.math;

public class Circulo extends FormasGeometricas {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override 
    public void calcularArea(){
        area = 3.14 * raio * raio ;
        System.out.println("Área do circulo: " + area);
    }
    
}
