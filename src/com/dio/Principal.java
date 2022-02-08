package com.dio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        double valorA, valorB, total;
        Scanner scanner = new Scanner(System.in);
        Calculo calculo = new Calculo();

        System.out.println("Insira o primerio valor");
        valorA = scanner.nextDouble();

        System.out.println("Insira o segundo valor");
        valorB = scanner.nextDouble();

        total = calculo.soma(valorA, valorB);
        System.out.println("Valor total: " + total);

    }

}
