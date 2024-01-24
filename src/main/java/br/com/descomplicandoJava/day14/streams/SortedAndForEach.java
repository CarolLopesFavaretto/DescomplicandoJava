package br.com.descomplicandoJava.day14.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndForEach {

    public static void main(String[] args) {

        List<String> unsortedList = Arrays.asList("0", "4", "9", "6", "Java", "Carol", "Sorted", "array", "Spring");

//        ordena os elementos e utlizando o for each para imprimi-los

        List<String> sortedList = unsortedList.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
