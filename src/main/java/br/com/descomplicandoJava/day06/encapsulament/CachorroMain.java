package br.com.descomplicandoJava.day06.encapsulament;

public class CachorroMain {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro();

        dog.setIdadePublic(5);
        dog.setPesopublic(7.6);

        dog.setPeso(6.8);
        dog.setIdade(10);

        dog.dormir();
        dog.latir();
        dog.comer();
    }
}
