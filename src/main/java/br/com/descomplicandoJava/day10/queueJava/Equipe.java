package br.com.descomplicandoJava.day10.queueJava;

public class Equipe {

    public String nome;
    public int saldoPontuacao;

    public Equipe(String nome, int saldoPontuacao) {
        this.nome = nome;
        this.saldoPontuacao = saldoPontuacao;
    }

    @Override
    public String toString() {
        return "Equipe " + nome + " está com a pontuacao " + saldoPontuacao;
    }
}
