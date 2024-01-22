package br.com.descomplicandoJava.day14.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {

    public static void main(String[] args) {

        List<String> listString = Arrays.asList("1", "2", "3");
        System.out.println(listString);

//       tranformando string para inteiro

        List<Integer> integerList = listString.stream()

//                map --> visa retornar o resultado de uma operação que foi realizada com esse stream
                .map(Integer::valueOf)
//                coletar resultados das transformacoes feitas em um fluxo
                .collect(Collectors.toList());

        System.out.println(integerList);

    }
}
