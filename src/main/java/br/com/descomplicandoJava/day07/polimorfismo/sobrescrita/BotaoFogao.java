package br.com.descomplicandoJava.day07.polimorfismo.sobrescrita;

public class BotaoFogao extends Botao {

    @Override
    public void ligar() {
        System.out.println("Ligando o fogão");
    }

    @Override
    public void desligar() {
        super.desligar();
    }
}
