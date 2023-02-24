package com.hugo.primeiraSemana.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        boolean resultado = (x > 0 && y < 20); // resultado será verdadeiro (true)

        int x1 = 5;
        int y1 = 10;
        boolean resultado1 = (x > 0 || y < 0); // resultado será verdadeiro (true)


        int x2 = 5;
        int y2 = 10;
        boolean resultado2 = !(x > 0 && y < 0); // resultado será verdadeiro (true)

    }
}
