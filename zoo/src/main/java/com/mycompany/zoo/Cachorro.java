package com.mycompany.zoo;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome,idade);
    }
    
    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override 
    public void emitirSom(){
        System.out.println(getNome() + " faz auau!");
    }
    
}