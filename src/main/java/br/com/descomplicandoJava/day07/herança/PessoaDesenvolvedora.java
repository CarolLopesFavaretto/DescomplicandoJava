package br.com.descomplicandoJava.day07.herança;

public class PessoaDesenvolvedora {

    private String nome;
    private String stack;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public PessoaDesenvolvedora(String nome, String stack, Double salario) {
        this.nome = nome;
        this.stack = stack;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void codar(){
        System.out.println("Bora Codar!");
    }
}
