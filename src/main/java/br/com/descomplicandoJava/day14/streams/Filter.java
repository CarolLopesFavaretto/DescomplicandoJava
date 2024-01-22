package br.com.descomplicandoJava.day14.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {

//        filter -> retornar elementos que passamos em um filtro indicado

        List<String> stacks = Arrays.asList("java", "react", "phyton", "node");

//        filtrando apenas a stack que termina com a letra "a"

        List<String> endToA = stacks.stream().filter(s -> s.endsWith("a")).collect(Collectors.toList());
        System.out.println(endToA);

    }
}
