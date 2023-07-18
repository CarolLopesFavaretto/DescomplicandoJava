package br.com.descomplicandoJava.day10.map;

import java.util.HashMap;

public class HashMapCollections {

    public static void main(String[] args) {

        /*armazena chave e valor
        * chave -> indice
        * valor -> objeto
        * permite chave nulas
        * não garante a ordem */

        HashMap<String, Double> notas = new HashMap<String, Double>();

        //inserir os valores
        notas.put("Matematica", 7.5);
        notas.put("Portugues", 9.5);
        notas.put("Geografia", 8.5);
        //pega o valor
        System.out.println(notas.get("Geografia"));

        System.out.println(notas.getOrDefault("Historia", 0.0));

        System.out.println(notas.containsKey("Matematica"));

        System.out.println(notas.containsValue(7.5));


    }
}
