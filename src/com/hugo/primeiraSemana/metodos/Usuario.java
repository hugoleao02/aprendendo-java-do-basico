package com.hugo.primeiraSemana.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartv = new SmartTv();


        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();

        smartv.diminuirVolume();
        System.out.println("Canal atual: " + smartv.canal);

        smartv.mudarCanal(15);

        System.out.println("Tv ligada ?: " + smartv.ligada);
        System.out.println("Canal atual: " + smartv.canal);
        System.out.println("Volume atual: " + smartv.volume);


        smartv.ligar();

        System.out.println("Novo status -> Tv ligada ?: " + smartv.ligada);

        smartv.desligar();

        System.out.println("Novo status -> Tv ligada ?: " + smartv.ligada);
    }
}
