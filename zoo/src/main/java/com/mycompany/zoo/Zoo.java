package com.mycompany.zoo;

public class Zoo {

    public static void main(String[] args) {

        Cachorro thor = new Cachorro("Thor do Euller");
        Gato gato = new Gato("Gato do Pedro",7);
        
        System.out.println("..:: Dados do cachorro ::..");
        System.out.println("O nome do cachorro é: " + thor.getNome());
        thor.emitirSom();
        
        System.out.println("..:: Dados do gato ::..");
        System.out.println("O nome do gato é: " + gato.getNome());
        System.out.println("A idade é: " + gato.getIdade());
        gato.emitirSom();
       
    }
}
