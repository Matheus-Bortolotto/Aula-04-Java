package org.example;

//Criando e manipulando instâncias
public class Main{
    public static void main(String[] args){
        //Criando duas contas Diferentes
        ContaBancaria conta1 = new ContaBancaria("João", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", 2000.0);

        //Manipulando conta1
        conta1.depositar(500.0); //saldo : 1500.0
        conta1.sacar(200.0); //saldo: 1300.0

        //Manipulando conta2
        conta2.depositar(1000.0); //saldo: 3000.0
        conta2.sacar(500.0); //saldo: 2500.0
    }
}
