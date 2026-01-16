import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Boleto extends Pagamento {
    private String codigoBoleto;
    private Date dataVencimento;

    public Boleto(int id, double valor, Date data, String status, String codigoBoleto, Date dataVencimento) {
        super(id, valor, data, status);
        this.codigoBoleto = codigoBoleto;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean processar() {
        // Simulação de processamento (validação de boleto)
        System.out.println("Processando pagamento via boleto: " + codigoBoleto);
        setStatus("Aprovado");
        return true;
    }

    // Getters
    public String getCodigoBoleto() { return codigoBoleto; }
    public Date getDataVencimento() { return dataVencimento; }
}
