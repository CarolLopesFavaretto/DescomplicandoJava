package br.com.descomplicandoJava.day10.queueJava;

import java.util.PriorityQueue;

public class PriorityQueueMain {


    public static void main(String[] args) {

        Equipe equipe1 = new Equipe("equipe1", 230);
        Equipe equipe2 = new Equipe("equipe2", 900);
        Equipe equipe3 = new Equipe("equipe3", 830);
        Equipe equipe4 = new Equipe("equipe4", 590);
        Equipe equipe5 = new Equipe("equipe5", 1590);

        PriorityQueue<Equipe> priorityQueue = new PriorityQueue<Equipe>(5, new EquipeComparator());

        priorityQueue.add(equipe1);
        priorityQueue.add(equipe2);
        priorityQueue.add(equipe3);
        priorityQueue.add(equipe4);
        priorityQueue.add(equipe5);

        for (Equipe equipe: priorityQueue){
            System.out.println(equipe);
        }

    }
}
