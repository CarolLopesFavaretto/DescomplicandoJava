package br.com.descomplicandoJava.day10.generics;

public class GenericsExample<T> {

    /* vieram para facilitar principalmente casos de casting entre tipos
    * reduzindo a complexidade e volume de código escrito
    * podemos ver um tipo generico de dados*/

    T name;

    public GenericsExample(T mensagem) {
        this.name = mensagem;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void escrever(){
        System.out.println(name);
    }

}
