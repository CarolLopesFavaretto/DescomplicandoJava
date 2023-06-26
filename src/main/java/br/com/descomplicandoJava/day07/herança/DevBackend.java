package br.com.descomplicandoJava.day07.herança;

public class DevBackend extends PessoaDesenvolvedora{

    //    refere-se ao construtor da classe base, por isso o uso do "super"
    public DevBackend(String nome, String stack, Double salario) {
        super(nome, stack, salario);
    }

    @Override
    public void codar() {
        super.codar();
    }
}
