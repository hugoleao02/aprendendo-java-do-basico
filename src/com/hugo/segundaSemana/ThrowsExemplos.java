package com.hugo.segundaSemana;

import java.util.Scanner;

public class ThrowsExemplos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = input.nextInt();

            int resultado = 10 / numero;

            System.out.println("O resultado é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        input.close();
    }
}
