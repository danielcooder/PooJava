package org.example;

public class PooJava {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Tipo esfereografica";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 88;
        c1.marca = "Bic";
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println();

        Caneta c2 = new Caneta();
        c1.modelo = "Tipo tinteiro";
        c1.cor = "Preta";
        c1.ponta = 1.5f;
        c1.carga = 95;
        c1.marca = "Compactor";
        c1.destampar();
        c1.status();
        c1.rabiscar();


    }

}
