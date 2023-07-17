package br.com.descomplicandoJava.day10.listJava;

import java.util.ArrayList;

public class ArrayListCollections {

    public static void main(String[] args) {

        /* nos fornece arrays dinamicos em java
         * pode ser mais lento que os arrays padrões
         * aumenta 50% de sua capacidade quando estiver cheio
         * quando aumenta de tamanho faz copia do array atual para um novo array com o mesmo tamanho
         * mais recomendado para buscas e leituras*/


        ArrayList<Integer> integerArrayList = new ArrayList<>();

        //adicionando elementos no arraylist
        for (int i = 1; i < 10; i++) {
            integerArrayList.add(i);
        }

        //removendo elementos no arraylist, atraves do index;
        integerArrayList.remove(1);
        System.out.println(integerArrayList);

        //acessando um indice especifico
        System.out.println(integerArrayList.get(3));

        //retorna se array esta vazio
        System.out.println(integerArrayList.isEmpty());

        //valida se encontra algum n° 3 no array
        System.out.println(integerArrayList.contains(3));

        //copia array
        System.out.println(integerArrayList.clone());

        //qual indice que esta localizado
        System.out.println(integerArrayList.indexOf(3));

        //limpando array
        integerArrayList.clear();
        System.out.println(integerArrayList.isEmpty());

    }
}
