package com.mycompany.lanchonete;

public class Cliente extends Pessoa {
    private int numeroCliente;

    public Cliente(int numeroCliente, String nome, int idade) {
        super(nome, idade);
        this.numeroCliente = numeroCliente;
    }
    
    public void exibirInfoCliente() {
        apresentar();
        System.out.println("Número do Cliente: " + numeroCliente);
    }
    
}
