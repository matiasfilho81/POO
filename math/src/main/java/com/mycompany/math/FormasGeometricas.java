package com.mycompany.math;

public class FormasGeometricas {
    protected double area;

    public FormasGeometricas() {
        this.area = 0.0;
    }
    
    public void calcularArea(){
        System.out.println("Área da forma geometrica: " + area);
    }
    
    
    // calculo da área de um quadrado
    public double calcularArea(double lado){
        return lado * lado;      
    }
    
    // calculo da área de um retangulo
    public double calcularArea(double largura, double comprimento){
        return largura * comprimento;      
    }
    
    public String concatenar (String a, String b){
        return a + b;
    }
    
    public String concatenar (String a, String b, String c){
        return a + b + c;
    }
    
    
}

