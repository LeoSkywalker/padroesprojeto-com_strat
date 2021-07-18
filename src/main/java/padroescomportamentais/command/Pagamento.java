package padroescomportamentais.command;

public class Pagamento {

    private int dia;
    private int mes;
    private double ano;
    private double horas;
    private String situacao;

    public Pagamento(int dia, int mes, double ano, double horas) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.horas = horas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void agendarPagamento(){
        this.situacao = "Pagamento agendado!";
    }

    public void efetuarPagamento(){
        this.situacao = "Pagamento efetuado!";
    }
}
