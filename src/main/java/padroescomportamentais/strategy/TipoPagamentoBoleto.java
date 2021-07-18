package padroescomportamentais.strategy;

public class TipoPagamentoBoleto implements TipoPagamento{

    public String efetuarPagamento(String msg) {
        if (msg.isEmpty()){
            throw new IllegalArgumentException("Escolha pelo menos uma forma de pagamento");
        }
        else {
            return "Pagamento em boleto escolhido";
        }
    }
}
