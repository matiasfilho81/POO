package com.mycompany.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        
        Calcular a = new Calcular();
        
        System.out.println(a.soma(2.0,3.0));
        System.out.println(a.soma(2,3));
        System.out.println(a.soma(2,3,5));

        
        a.conc("Olá, ", "mundo!");
        a.conc("Olá, ","mundo!\n", "Tudo bem?");
    }
}
