package br.com.descomplicandoJava.day12.Upcasting;


//Upcasting consiste em converter uma subclasse para uma superclasse,
// geralmente isso é feito de forma implicita pelo compilador diretamente ligado a herança e interfaces


public class Upcasting {

    public static void main(String[] args) {

        Passaro passaro = new Passaro();

        Animal animal = passaro;

//  provendo o mesmo comportamento

        passaro.comer();
        animal.comer();

    }
}
