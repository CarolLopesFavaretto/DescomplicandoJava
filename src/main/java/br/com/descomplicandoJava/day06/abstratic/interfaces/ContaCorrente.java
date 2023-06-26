package br.com.descomplicandoJava.day06.abstratic.interfaces;

public class ContaCorrente implements Conta{

    @Override
    public void consultarsaldo() {
        System.out.println(" seu saldo é 20,00");
    }

    @Override
    public void fazerPix() {
        System.out.println("digite o valor que deseja transferir");
    }
}
