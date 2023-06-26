package br.com.descomplicandoJava.day06.abstratic.classeAbstrata;

public class ContaPoup extends Conta {

    @Override
    public void consultarsaldo() {
        System.out.println(" seu saldo é 0,00");
    }

    @Override
    public void fazerPix() {
        System.out.println(" voc~e não consegue fazer pix de conta poupança, favor solicitar acesso");
    }
}
