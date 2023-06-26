package br.com.descomplicandoJava.day07.polimorfismo.sobrecarga;

public class Pagamento {


    //    pagamento a vista
    public Double pagamento(Double valor) {
        return valor;
    }

    //    pagamento parcelado
    public Integer pagamento(Integer valor, Integer parcelas) {
        return valor / parcelas;
    }

    //    pagamento c/ juros
    public Long pagamento (Integer valor, Integer parcelas, Long juros){
        return (valor/parcelas) + juros;
    }
}
