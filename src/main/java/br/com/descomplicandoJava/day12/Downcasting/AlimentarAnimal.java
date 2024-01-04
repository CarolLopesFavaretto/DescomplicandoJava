package br.com.descomplicandoJava.day12.Downcasting;


//classe não tem responsabilidade de saber qual animal esta na lista
//usaremos polimorfismo


public class AlimentarAnimal {

    public static void alimentar(Animal animal) {
        animal.comer();
        //so queremos fazer downcasting do que for do tipo Cachorro
        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal; // Downcasting
            cachorro.latir();
        }
    }
}
