package padroescomportamentais.strategy;

public class Pagamento {

    private String msg;

    public Pagamento(String msg) {
        this.msg = msg;
    }

    public String efetuarPagamento(TipoPagamento tipoPagamento){
        return tipoPagamento.efetuarPagamento(msg);
    }
}
