package com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Composição !
        Carro carro = new Carro();

        // Atributos
        carro.setNome("Ika");
        carro.setCor("Azul");
        carro.setModelo("Ika Torino");
        carro.setCapacidadeTanque(25);

        System.out.println(carro.getNome());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(6.45));

        // Composição
        Carro carro1 = new Carro("Conosur", "Preto", "Rastrojero Conosur", 15);

        System.out.println(carro1.getNome());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.45));

    }
}
