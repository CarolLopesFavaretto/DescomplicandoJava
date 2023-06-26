package br.com.descomplicandoJava.day06;

import br.com.descomplicandoJava.day06.encapsulament.Cachorro;

public class CachorroProtected {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        dog.setPesoProtected(4.5);
        dog.setIdadeProtected(5);

        dog.latir();
    }
}
