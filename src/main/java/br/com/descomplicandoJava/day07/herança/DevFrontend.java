package br.com.descomplicandoJava.day07.herança;

public class DevFrontend extends PessoaDesenvolvedora {

    //    refere-se ao construtor da classe base, por isso o uso do "super"
    public DevFrontend(String nome, String stack, Double salario) {
        super(nome, stack, salario);
    }

    //    refere-se ao metodo que contem na classe base
    @Override
    public void codar() {
        super.codar();
    }
}
