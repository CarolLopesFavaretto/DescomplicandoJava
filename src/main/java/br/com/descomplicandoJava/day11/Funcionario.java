package br.com.descomplicandoJava.day11;

import java.util.Objects;

public class Funcionario {

    private String nome;
    private String cargo;
    private String setor;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario " + nome + " possue cargo de " + cargo + " no setor " + setor + " com salario " + salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cargo, that.cargo)
                && Objects.equals(setor, that.setor) && Objects.equals(salario, that.salario);
    }

}
