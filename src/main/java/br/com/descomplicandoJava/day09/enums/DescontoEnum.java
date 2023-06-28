package br.com.descomplicandoJava.day09.enums;

public enum DescontoEnum {

    ALUNO(10), FUNCIONARIO(20), EXTERNO(5);
    int valor;

    DescontoEnum(int valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {

        for (DescontoEnum descontoEnum : DescontoEnum.values()) {

            System.out.println("Os descontos disponiveis são: " + descontoEnum + " valor desconto "
                    + descontoEnum.valor + " porcento");
        }
    }
}
