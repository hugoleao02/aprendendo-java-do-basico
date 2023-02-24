package com.hugo.primeiraSemana.operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 20;
        String status = idade >= 18 ? "adulto" : "menor"; // retorna adulto

        int a = 10;
        int b = 15;
        int maior = (a > b) ? a : b; //retorna falso

    }
}
