package br.com.descomplicandoJava.day08;

import java.io.File;
import java.util.Scanner;

public class ValidandoNF {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Desenvolvimento\\DescomplicandoJava\\nota-fiscal-1.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
