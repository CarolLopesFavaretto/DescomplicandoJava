package br.com.descomplicandoJava.day10.queueJava;

import java.util.Comparator;

public class EquipeComparator implements Comparator<Equipe> {

    //ordena por uma determinada prioridade e não por fifo

    @Override
    public int compare(Equipe o1, Equipe o2) {
        if (o1.saldoPontuacao < o2.saldoPontuacao) {
            return 1;
        } else if (o1.saldoPontuacao > o2.saldoPontuacao) {
            return -1;
        }
        return 0;
    }
}
