package br.com.descomplicandoJava.day10.generics;

public class GenericsMain {

    public static void main(String[] args) {

        GenericsExample<Integer> msnInteger = new GenericsExample<>(1000);
        msnInteger.escrever();

        GenericsExample<Double> msnDouble = new GenericsExample<>(1000.55);
        msnDouble.escrever();

        GenericsExample<String> msnString = new GenericsExample<>("Testando generics!");
        msnString.escrever();
    }
}
