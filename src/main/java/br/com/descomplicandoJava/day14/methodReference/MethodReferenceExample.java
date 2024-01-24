package br.com.descomplicandoJava.day14.methodReference;

public class MethodReferenceExample {

    public static void main(String[] args) {

        Program program = Method::programInJava;
        program.program();
    }
}
