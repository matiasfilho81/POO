
package com.mycompany.polimorfismo;

public class Calcular {
    
    public int soma (int a_int, int b_int){
        return a_int+b_int;
    }
    
    public int soma (int a_int, int b_int, int c_int){
        return a_int+b_int+c_int;
    }
    
    public double soma (double a_double, double b_double){
        return a_double+b_double;
    }
    
    public void conc(String l1, String l2){
        System.out.println(l1+l2);
    }
    
    public void conc(String l1, String l2, String l3){
        System.out.println(l1+l2+l3);
    }
    
}
