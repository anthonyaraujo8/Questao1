import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pix extends Pagamento {
    private String chavePix;

    public Pix(int id, double valor, Date data, String status, String chavePix) {
        super(id, valor, data, status);
        this.chavePix = chavePix;
    }

    @Override
    public boolean processar() {
        // Simulação de processamento (geração de QR code, etc.)
        System.out.println("Processando pagamento via Pix: " + chavePix);
        setStatus("Aprovado");
        return true;
    }

    // Getter
    public String getChavePix() { return chavePix; }
}