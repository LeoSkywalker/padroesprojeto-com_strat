package padroescomportamentais.strategy;

public class Pessoa {

    private String formaPagamento;

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void pagarBoleto(String pagamentoEscolhido){
        Pagamento pagamento = new Pagamento(pagamentoEscolhido);
        this.formaPagamento = pagamento.efetuarPagamento(new TipoPagamentoBoleto());
    }

    public void pagarCredito(String pagamentoEscolhido){
        Pagamento pagamento = new Pagamento(pagamentoEscolhido);
        this.formaPagamento = pagamento.efetuarPagamento(new TipoPagamentoCredito());
    }

    public void pagarPix(String pagamentoEscolhido){
        Pagamento pagamento = new Pagamento(pagamentoEscolhido);
        this.formaPagamento = pagamento.efetuarPagamento(new TIpoPagamentoPix());
    }
}
