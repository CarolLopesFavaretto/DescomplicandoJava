package br.com.descomplicandoJava.day13.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


//As Exceptions do tipo Checked são aquelas que são verificadas em tempo de compilação pelo compilador Java.
// Isso significa que, se você utilizar um método que pode lançar uma exceção Checked,
// você precisará tratá-la ou declará-la no cabeçalho do método.

public class FileNotFoundExample {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("invalidpath.txt");
        } catch (FileNotFoundException e) {
            System.out.println("arquivo não localizado no caminho informado, ocorreu o seguinte erro {[]}  " + e);
        }
    }
}
