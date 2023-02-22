package com.hugo.primeiraSemana;

public class TiposVariaveis {
    public static void main(String[] args) {

        double salararioMinimo = 2500;
        System.out.print(salararioMinimo+"\n");

        short numeroCurto = 2;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.print(numeroCurto2);

        int numero = 10;
        numero = 5;
        System.out.print(numero+"\n");

        // constante tem que usar final. e letra caixa alta por convenção

        final double VALOR_DO_PI = 3.14;
        //double VALOR_DO_PI = 3.14;
        //VALOR_DO_PI =7.75;
        System.out.print(VALOR_DO_PI+"\n");



    }
}