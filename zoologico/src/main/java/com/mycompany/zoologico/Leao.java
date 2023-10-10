package com.mycompany.zoologico;

public class Leao extends Animal{

    public Leao(String nome, double peso) {
        super(nome, peso);
    }
    
    public Leao(String nome) {
        super(nome);
    }
    
    public Leao() {
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O leão faz o raaaaaAAAaaaaaw");
    }
      
}
