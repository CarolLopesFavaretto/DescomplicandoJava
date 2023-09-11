package br.com.descomplicandoJava.day11;

public class ToString {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Caroline");
        funcionario.setCargo("Desenvolvedora");
        funcionario.setSetor("Telecom");
        funcionario.setSalario(8000.00);

        // utilizando o toString personalizado da classe
        System.out.println(funcionario);

        //comparando os valores de nome
        System.out.println(funcionario.getNome().equals("Caroline"));

        //pegando o hash de cada atributo da classe
        System.out.println(funcionario.hashCode());
        System.out.println(funcionario.getSetor().hashCode());
        System.out.println(funcionario.getSalario().hashCode());
        System.out.println(funcionario.getNome().hashCode());
        System.out.println(funcionario.getCargo().hashCode());


        var setorHashCode = String.valueOf(funcionario.getSetor().hashCode());
        var setorHashCodeNovo = String.valueOf("Telecom".hashCode());
        System.out.println(setorHashCode.equals(setorHashCodeNovo));
    }
}
