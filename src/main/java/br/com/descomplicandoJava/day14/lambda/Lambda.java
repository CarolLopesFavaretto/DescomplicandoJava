package br.com.descomplicandoJava.day14.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {


        List<String> stacks = Arrays.asList("java", "react", "phyton", "node");


        List<String> java = stacks.stream().filter(s -> s.equals("java")).collect(Collectors.toList());
        System.out.println(java);

    }
}

