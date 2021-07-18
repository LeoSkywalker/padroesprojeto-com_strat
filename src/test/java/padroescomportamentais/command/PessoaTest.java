package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    Pessoa pessoa;
    Pagamento pagamento;

    @BeforeEach
    void setUp(){
        pessoa = new Pessoa();
        pagamento = new Pagamento(4,7,2018,23);
    }

    @Test
    void deveAgendarPagamento() {
        Tarefa agendamentoPagamento = new AgendaPagamentoTarefa(pagamento);
        pessoa.executarTarefa(agendamentoPagamento);

        assertEquals("Pagamento agendado!", pagamento.getSituacao());
    }

    @Test
    void deveEfetuarPagamento(){
        Tarefa efetuacaoPagamento = new EfetuaPagamentoTarefa(pagamento);
        pessoa.executarTarefa(efetuacaoPagamento);

        assertEquals("Pagamento efetuado!", pagamento.getSituacao());
    }

    @Test
    void deveCancelarEfetuacaoPagamento() {

        Tarefa agendamentoPagamento = new AgendaPagamentoTarefa(pagamento);
        Tarefa efetuacaoPagamento = new EfetuaPagamentoTarefa(pagamento);

        pessoa.executarTarefa(agendamentoPagamento);
        pessoa.executarTarefa(efetuacaoPagamento);

        pessoa.cancelarUltimaTarefa();

        assertEquals("Pagamento agendado!", pagamento.getSituacao());
    }

}
