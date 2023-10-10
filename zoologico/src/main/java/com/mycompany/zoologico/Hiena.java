package com.mycompany.zoologico;

public class Hiena extends Animal{

    public Hiena(String nome, double peso) {
        super(nome, peso);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("A hiena faz o hauhauhauhau");
    }
      
}
