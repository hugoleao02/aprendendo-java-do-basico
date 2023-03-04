package com.hugo.segundaSemana.laços;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // sai do laço for quando i for igual a 5
            }
            System.out.println(i);
        }

    }
}
