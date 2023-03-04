package com.hugo.segundaSemana.condicional;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 8;

        if (x > y) {
            if (x > z) {
                System.out.println("x é o maior número");
            } else {
                System.out.println("z é o maior número");
            }
        } else {
            if (y > z) {
                System.out.println("y é o maior número");
            } else {
                System.out.println("z é o maior número");
            }
        }

    }
}
