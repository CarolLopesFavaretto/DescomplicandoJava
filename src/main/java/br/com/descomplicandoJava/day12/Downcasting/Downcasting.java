package br.com.descomplicandoJava.day12.Downcasting;

import java.util.ArrayList;
import java.util.List;

import static br.com.descomplicandoJava.day12.Downcasting.AlimentarAnimal.alimentar;

// trata-se de é o processo de converter um objeto de um tipo mais genérico (superclasse)
// para um tipo mais específico (subclasse). Em outras palavras, é quando você
// atribui um objeto de uma classe pai a uma variável de uma classe filha.


public class Downcasting {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Passaro());
        animalList.add(new Cachorro());

        for(Animal animal: animalList){
            alimentar(animal);
        }

//        downcasting
        Animal animal = new Cachorro();
    }
}
