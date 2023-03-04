package com.hugo.segundaSemana.laços;

public class LacoForEmArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5,6,7};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("O elemento " + (i+1) + " do array é " + numeros[i]);
        }

    }
}
