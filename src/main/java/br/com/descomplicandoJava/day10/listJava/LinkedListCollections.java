package br.com.descomplicandoJava.day10.listJava;

import java.util.LinkedList;

public class LinkedListCollections {

    public static void main(String[] args) {

        /*igual ao array list, porém com melhor performace para os metodos
        * add e remove*/

        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 1; i<10; i++){
            linkedList.add(i);
        }
        System.out.println(linkedList);

        //remove o 1° elemento da lista
        System.out.println(linkedList.pop());
        System.out.println(linkedList);

        //mostra qual o 1° elemento da lista
        System.out.println(linkedList.peek());
        System.out.println(linkedList);

        //remove o 1° elemento da lista
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList);

        //remove o ultimo elemento da lista
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);

    }
}
