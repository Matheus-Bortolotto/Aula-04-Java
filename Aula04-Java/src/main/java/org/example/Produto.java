package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int quandidade;

    public Produto(String nome, double preco, int quandidade){
        this.nome = nome;
        this.preco = preco;
        this.quandidade = quandidade;
    }

    public  void adicionarEstoque(int qtd){
        this.quandidade += qtd;
    }

    public  void vender(int qtd){
        if(qtd <= this.quandidade){
            this.quandidade -= qtd;
        }
    }
}

//Usando a classe Produto
//Produto arroz = new Produto("Arroz", 10.0, 50);
//Produto feijao = new Produto("Feijão", 8.0, 30);
//
//arroz.adiconarEstoque(20);
//feijao.vender(5)