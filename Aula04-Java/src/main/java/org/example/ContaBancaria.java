package org.example;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        }
    }
}
