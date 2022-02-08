package com.dio;

public class Calculo implements OperacaoMatematica{

    @Override
    public double soma(double a, double b) {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    @Override
    public double divisao(double a, double b) {
        return a / b;
    }
}
