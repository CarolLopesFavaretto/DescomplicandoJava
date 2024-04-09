package br.com.descomplicandoJava.day14.records;

public class RecordMain {

    public static void main(String[] args) {

        RecordExample example = new RecordExample("Caroline", "28", "Java");
        System.out.println(example.name());
        System.out.println(example.stack().equals("Java"));

    }
}
