package br.com.descomplicandoJava.day10.listJava;

import java.util.Vector;

public class VectorListCollections {

    public static void main(String[] args) {

        /*também parecido com o arraylist, mais é thread safe,
        * alocacao dinamica -> aumenta 100% o tamanho quando estiver cheio*/

        Vector<Integer> vector = new Vector<>();

        for(int i = 1; i<10; i++){
            vector.add(i);
        }
        System.out.println(vector);

        //pega o elemento que esta no indice
        System.out.println(vector.elementAt(8));

        //pega o 1° elemento da lista
        System.out.println(vector.firstElement());

        //qual indice que esta localizado
        System.out.println(vector.indexOf(3));

        //adicionando elementos em indice especifico
        vector.add(1,30);
        System.out.println(vector);

    }
}
