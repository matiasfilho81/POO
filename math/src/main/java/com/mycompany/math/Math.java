package com.mycompany.math;

public class Math {

    public static void main(String[] args) {
        
        Calculadora cal = new Calculadora();
        
        System.out.println(new Calculadora().soma(3,5));
        System.out.println(new Calculadora().soma(3.5,5.5));
        System.out.println(new Calculadora().soma(3.5,5));   
    }
}
