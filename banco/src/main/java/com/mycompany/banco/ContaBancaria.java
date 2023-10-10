package com.mycompany.banco;

public class ContaBancaria {

    private double saldo;
    private String numero;

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public void debitar(double valor) {
        this.saldo -= valor;
    }

    public ContaBancaria(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "saldo=" + saldo + ", numero=" + numero + '}';
    }

}
