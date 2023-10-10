package com.mycompany.banco;

public class Banco {

    public static void main(String[] args) {
        
        ContaBancaria gado = new ContaBancaria(0.0,"1234-5");
        
        System.out.println(gado.toString());
        
        gado.creditar(1000.0);
        
        System.out.println(gado.toString());
        
        gado.debitar(2000.0);
        
        System.out.println(gado.toString());
    }
}
