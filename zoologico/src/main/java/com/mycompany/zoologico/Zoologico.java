package com.mycompany.zoologico;

public class Zoologico {

    public static void main(String[] args) {
        
        Leao a1 = new Leao();
        Leao a2 = new Leao();
        Leao a3 = new Leao();

       
        System.out.println("Scar");
        
        System.out.println(new Leao("Scar",4.0).toString());
        new Leao().emitirSom();
        
        System.out.println("Fim do Scar");
      
    }
}
