package com.dio;

// Classe carro criada
class Carro {

    // Atributos
    String nome;
    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor vazio
    Carro() {}

    // Construtor
    Carro(String nome, String cor, String modelo, int capacidadeTanque) {
        this.nome = nome;
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Métodos acessores
    public String getNome() {
        return nome;
    }

    String getCor() {
        return cor;
    }

    String getModelo() {
        return modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }


    // Métodos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // Método
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
