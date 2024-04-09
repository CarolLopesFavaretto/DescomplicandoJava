package br.com.descomplicandoJava.day14.records;

// oficialmente no Java 16
//um record é uma classe que armazena dados, ela é imutavel
//ja possui por padrão so metodos equals, hashCode e toString
//diminui escrita de codigo boiler plate e do lombok

public record RecordExample(String name, String age, String stack) {
}
