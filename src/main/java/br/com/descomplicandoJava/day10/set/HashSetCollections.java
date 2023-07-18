package br.com.descomplicandoJava.day10.set;

import java.util.HashSet;

public class HashSetCollections {

    /*coleção de itens onde cada item é unico
     * implementa a interface SET, que não permite elementos duplicados
     * objetos são inseridos com base no seu código hash
     * elementos null também são permitidos*/

    public static void main(String[] args) {

        HashSet<String> linguagem = new HashSet<>();

        linguagem.add("java");
        linguagem.add("javascript");
        linguagem.add("kotlin");
        linguagem.add("Python");
        linguagem.add("null");

        System.out.println(linguagem);

        System.out.println(linguagem.size());

        System.out.println(linguagem.contains("java"));

        for (String i : linguagem) {
            System.out.println(i);
        }
    }
}
