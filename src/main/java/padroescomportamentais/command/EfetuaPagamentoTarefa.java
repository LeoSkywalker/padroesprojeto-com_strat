package padroescomportamentais.command;

public class EfetuaPagamentoTarefa implements Tarefa{

    private Pagamento pagamento;

    public EfetuaPagamentoTarefa(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public void executar() {
        this.pagamento.efetuarPagamento();
    }

    public void cancelar() {
        this.pagamento.agendarPagamento();
    }
}
