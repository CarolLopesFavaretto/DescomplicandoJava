package br.com.descomplicandoJava.day10.set;


import java.util.LinkedHashSet;

public class LinkedHashSetCollections {

    public static void main(String[] args) {

        /*implementação de hashtable e lista vinculada da interface SET
         * herda da hashset e implementa a set
         * elementos devem ser unicos - não duplicados
         * mantem a ordem da inserção*/


        LinkedHashSet<String> linguagem = new LinkedHashSet<>();

        linguagem.add("java");
        linguagem.add("javascript");
        linguagem.add("kotlin");
        linguagem.add("Python");
        linguagem.add("null"); //--> aceita valor null
        linguagem.add("java"); //--> ignora valores duplicados

        System.out.println(linguagem); //--> sequencial a inserção [java, javascript, kotlin, Python, null]

        System.out.println(linguagem.size());

        System.out.println(linguagem.contains("java"));

        System.out.println(linguagem.remove("null"));

        System.out.println(linguagem.size());

        for (String i : linguagem) {
            System.out.println(i);
        }
    }
}

