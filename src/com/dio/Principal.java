package com.dio;

public class Principal {

    public static void main(String[] args) {
        Mae[] classes = new Mae[]{new Filha(), new Filho(), new Mae()};

        for(Mae classe : classes) {
            classe.metodo1();
        }

        System.out.println();

        for (Mae classe : classes) {
            classe.metodo2();
        }

        System.out.println();

        Mae filho = new Filho();
        filho.metodo2();
    }

}
