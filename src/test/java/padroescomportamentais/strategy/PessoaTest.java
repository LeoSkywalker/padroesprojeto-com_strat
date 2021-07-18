package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void devePagarEmBoleto(){
        Pessoa pessoa = new Pessoa();
        pessoa.pagarBoleto("Boleto");
        assertEquals("Pagamento em boleto escolhido", pessoa.getFormaPagamento());
    }

    @Test
    void devePagarEmCredito(){
        Pessoa pessoa = new Pessoa();
        pessoa.pagarCredito("Crédito");
        assertEquals("Pagamento em cartão de crédito escolhido", pessoa.getFormaPagamento());
    }

    @Test
    void devePagarEmPix(){
        Pessoa pessoa = new Pessoa();
        pessoa.pagarPix("Pix");
        assertEquals("Pagamento em Pix escolhido", pessoa.getFormaPagamento());
    }

    @Test
    void naoDeveEscolherNenhumaFormaPagamento(){
        try{
            Pessoa pessoa = new Pessoa();
            pessoa.pagarBoleto("");
            pessoa.pagarCredito("");
            pessoa.pagarPix("");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Escolha pelo menos uma forma de pagamento", e.getMessage());
        }
    }
}
