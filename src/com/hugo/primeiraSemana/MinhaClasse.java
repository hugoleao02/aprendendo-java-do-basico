package com.hugo.primeiraSemana;

public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Hugo";
        String segundoNome = "Ferreira";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
