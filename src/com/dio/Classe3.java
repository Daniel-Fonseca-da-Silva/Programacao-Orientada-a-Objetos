package com.dio;

public class Classe3 {

    Classe1 classe1;

    void metodo() {
        int valorPublico = classe1.valorPublico; // Publico
        int valorProtegido = classe1.valorProtegido; // Protegido

        classe1.metodoPublico(); // Método publico
        classe1.metodoProtegido(); // Método protegido

    }

}
