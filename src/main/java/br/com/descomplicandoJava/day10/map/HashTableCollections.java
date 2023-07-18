package br.com.descomplicandoJava.day10.map;

import java.util.Hashtable;

public class HashTableCollections {

    public static void main(String[] args) {

        /*chave e valor
        * não permite valores nulos
        * não permite valores duplicados*/

        Hashtable<String, Double> notas = new Hashtable<String, Double>();


        //inserir os valores
        notas.put("Matematica", 7.5);
        notas.put("Portugues", 9.5);
        notas.put("Geografia", 8.5);
        //pega o valor
        System.out.println(notas.get("Geografia"));

        System.out.println(notas.getOrDefault("Historia", 0.0));

        System.out.println(notas.containsKey("Matematica"));

        System.out.println(notas.containsValue(7.5));

        System.out.println(notas.values());

        //atualiza os valores
        System.out.println(notas.replace("Matematica", 10.0));

        System.out.println(notas);

        //se ausente, insere
        System.out.println(notas.putIfAbsent("Historia", 10.0));

        System.out.println(notas);

    }
}
