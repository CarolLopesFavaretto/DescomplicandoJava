package br.com.descomplicandoJava.day14.patternMatching;

//pattern matching for switch veio no java 17 (preview)
//confere se o tipo tambem se encaixa no padrão especificado

public class Pattern {

    static double transformaEmDouble (Object number){
        return switch (number){
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}
