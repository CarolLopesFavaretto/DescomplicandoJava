package br.com.descomplicandoJava.day06.abstratic.classeAbstrata;

public class ContaCorrente extends Conta {

    @Override
    public void consultarsaldo() {
        System.out.println(" seu saldo é 10,00");
    }

    @Override
    public void fazerPix() {
        System.out.println("digite o valor que deseja transferir");
    }
}
