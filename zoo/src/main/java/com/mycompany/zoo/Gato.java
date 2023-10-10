package com.mycompany.zoo;

public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome,idade);
    }
    
    public Gato(String nome) {
        super(nome);
    }
    
    @Override 
    public void emitirSom(){
        System.out.println(getNome() + " faz miau!");
    }
    
}
