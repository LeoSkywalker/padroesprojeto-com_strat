package padroescomportamentais.command;

public class AgendaPagamentoTarefa implements Tarefa{

    private Pagamento pagamento;

    public AgendaPagamentoTarefa(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public void executar() {
        this.pagamento.agendarPagamento();
    }

    public void cancelar() {
        this.pagamento.efetuarPagamento();
    }
}
