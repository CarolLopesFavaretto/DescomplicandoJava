package br.com.descomplicandoJava.day06.abstratic.classeAbstrata;

public class ContaMain {

    public static void main(String[] args) {

        System.out.println("Seja bem vindo ao ContaBank");

        ContaCorrente cc = new ContaCorrente();

        cc.consultarsaldo();
        cc.fazerPix();

        ContaPoup cp = new ContaPoup();

        cp.consultarsaldo();
        cp.fazerPix();
    }
}
