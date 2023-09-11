package br.com.descomplicandoJava.day12;

//este tipo de typecasting ocorre quando a conversão é feita automaticamente

public class Widening {

    public static void main(String[] args) {

        int varInt = 123;
        long varLong = varInt;

        System.out.println(varInt);
        System.out.println(varLong);

        //neste tipo de conversão o valor é armazenado em um container maior;
        //o espaço extra existente a esquerda é preenchido com 0;

        //quando passamos valores inteiros para pontos flutuantes, ocorre a mesma coisa

        float varFloat = varLong;
        System.out.println(varFloat);

        double varDouble = varFloat;
        System.out.println(varDouble);

        //não ocorre perca de informações com o tamanho do tipo for maior;
        //byte -> short -> char -> int -> long -> float -> double

    }
}
