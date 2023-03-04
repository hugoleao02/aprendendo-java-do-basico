package com.hugo.segundaSemana.laços;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // pula a iteração quando i for igual a 5
            }
            System.out.println(i);
        }

    }
}
