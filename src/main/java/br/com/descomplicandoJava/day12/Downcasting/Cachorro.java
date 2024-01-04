package br.com.descomplicandoJava.day12.Downcasting;

public class Cachorro  extends Animal {
    @Override
    public void comer() {
        super.comer();
    }

    //downcasting
    public void latir(){
        System.out.println("latir");
    }
}
