package br.com.descomplicandoJava.day06.encapsulament;

public class Cachorro {

    //apenas a classe possui acesso
    private Double peso;
    private Integer idade;

    //todo projeto tem acesso
    public Double pesopublic;
    public Integer idadePublic;

    //acesso a nivel pacote
    protected Double pesoProtected;
    protected Integer idadeProtected;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPesopublic() {
        return pesopublic;
    }

    public void setPesopublic(Double pesopublic) {
        this.pesopublic = pesopublic;
    }

    public Integer getIdadePublic() {
        return idadePublic;
    }

    public void setIdadePublic(Integer idadePublic) {
        this.idadePublic = idadePublic;
    }

    public Double getPesoProtected() {
        return pesoProtected;
    }

    public void setPesoProtected(Double pesoProtected) {
        this.pesoProtected = pesoProtected;
    }

    public Integer getIdadeProtected() {
        return idadeProtected;
    }

    public void setIdadeProtected(Integer idadeProtected) {
        this.idadeProtected = idadeProtected;
    }

    public String latir() {
        return "AuAU";
    }

    protected String dormir() {
        return "zzzzz";
    }

     String comer() {
        return "hora da racao";

    }
}
