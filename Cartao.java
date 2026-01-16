import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cartao extends Pagamento {
    private String numeroCartao;
    private String validade;
    private String cvv;

    public Cartao(int id, double valor, Date data, String status, String numeroCartao, String validade, String cvv) {
        super(id, valor, data, status);
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.cvv = cvv;
    }

    @Override
    public boolean processar() {
        // Simulação de processamento (em um sistema real, integraria com API de cartão)
        System.out.println("Processando pagamento via cartão: " + numeroCartao);
        setStatus("Aprovado");
        return true;
    }

    // Getters
    public String getNumeroCartao() { return numeroCartao; }
    public String getValidade() { return validade; }
    public String getCvv() { return cvv; }
}
