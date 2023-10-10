package com.mycompany.math;

public class Retangulo extends FormasGeometricas {
    
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    @Override 
    public void calcularArea(){
        area = comprimento * largura;
        System.out.println("Área do retângulo: " + area);
    }
    
}
