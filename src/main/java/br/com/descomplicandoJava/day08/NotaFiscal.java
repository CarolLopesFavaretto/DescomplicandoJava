package br.com.descomplicandoJava.day08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class NotaFiscal {

    public static void main(String[] args) throws IOException {
        System.out.println("Insira o codigo do produto");

        Scanner sc = new Scanner(System.in);
        String codigo = sc.nextLine();
        System.out.println("Insira a quantidade de itens desse produto");
        Integer quantidade = sc.nextInt();
        System.out.println("Insira a valor desse produto");
        Integer valor = sc.nextInt();

        int total = valor * quantidade;
        System.out.println("O valor total da sua compra é " + total);


        // emitindo a NF
        System.out.println("Aguarde um momento que estamos emitindo sua nota fiscal");
        Path fileName = Path.of("C:\\Desenvolvimento\\DescomplicandoJava\\nota-fiscal-" + codigo + ".txt");

        String text = "Código do produto:  " + codigo + " Qtde:  " + quantidade + " valor do produto:  " + valor + "\n"
                + " total da compra:  " + total + "";

        Files.writeString(fileName, text);

        String file_content = Files.readString(fileName);

        System.out.println(file_content);
    }
}
