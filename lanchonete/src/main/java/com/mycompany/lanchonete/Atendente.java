package com.mycompany.lanchonete;

public class Atendente extends Pessoa {
    private final int numeroAtendente;

    public Atendente(int numeroAtendente, String nome, int idade) {
        super(nome, idade);
        this.numeroAtendente = numeroAtendente;
    }
    
    public void exibirInfoCliente() {
        apresentar();
        System.out.println("Número do Atendente: " + numeroAtendente);
    }
    
}
