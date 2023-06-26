package br.com.descomplicandoJava.day07.polimorfismo.sobrescrita;

public class BotaoTv extends Botao {

    @Override
    public void ligar() {
        System.out.println("Bora ver a novela");
    }

    @Override
    public void desligar() {
        System.out.println("Chega por hoje, bora dormir");
    }
}
