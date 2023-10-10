package com.mycompany.lanchonete;

public class Lanchonete {

    public static void main(String[] args) {
       
        Cliente cliente1 = new Cliente(1, "José Matias", 42);
        Atendente atendente1 = new Atendente(1,"Ricardo Goes", 50);
        
        System.out.println("Informações do Cliente: ");
        cliente1.apresentar();
        
        System.out.println("Informações do Atendente: ");
        atendente1.apresentar();
    }
}
