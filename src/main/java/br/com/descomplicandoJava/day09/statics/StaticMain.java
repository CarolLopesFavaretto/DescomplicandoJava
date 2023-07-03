package br.com.descomplicandoJava.day09.statics;

import java.util.Locale;

import static br.com.descomplicandoJava.day09.statics.StaticPedidos.*;

public class StaticMain {

    public static void main(String[] args) {

        pedidosFeitos++;
        status.toLowerCase(Locale.ROOT);

        completarPedido();
        completarPedido();
        completarPedido();

    }


}
