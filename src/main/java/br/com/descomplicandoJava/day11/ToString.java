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
    }
}
