package br.com.descomplicandoJava.day11;

public class ToString {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Caroline");
        funcionario.setCargo("Desenvolvedora");
        funcionario.setSetor("Telecom");
        funcionario.setSalario(8000.00);

        System.out.println(funcionario);

        System.out.println(funcionario.getNome().equals("Caroline"));

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
