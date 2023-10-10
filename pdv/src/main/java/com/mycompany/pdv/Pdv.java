package com.mycompany.pdv;

public class Pdv {

    public static void main(String[] args) {
        
        Produto churrascoMae = new Produto("Kaiser",36);
        System.out.println(churrascoMae.toString());
        Produto churrascoChefe = new Produto("Stella");
        System.out.println(churrascoChefe.toString());
        churrascoChefe.setQuantidade(2);
        System.out.println(churrascoChefe.toString());
        
        Produto deUltimaHora = new Produto();
        System.out.println(deUltimaHora.toString());
        deUltimaHora.setNome("Bharma");
        deUltimaHora.setQuantidade(12);
        System.out.println(deUltimaHora.toString());



        

    }
}
