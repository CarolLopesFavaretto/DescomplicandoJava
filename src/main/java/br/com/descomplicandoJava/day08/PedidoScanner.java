package br.com.descomplicandoJava.day08;

import java.util.Scanner;

public class PedidoScanner {

    public static void main(String[] args) {
        System.out.println("Insira o codigo do produto");

        Scanner sc = new Scanner(System.in);
        String codigo = sc.nextLine();
        System.out.println("Insira a quantidade de itens desse produto");
        Integer quantidade = sc.nextInt();
        System.out.println("Insira a valor desse produto");
        Integer valor = sc.nextInt();

        int total = valor * quantidade;
        System.out.println("O valor total da sua compra é " + total);

    }
}
