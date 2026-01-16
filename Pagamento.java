import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pagamento {
    private int id;
    private double valor;
    private Date data;
    private String status;

    public Pagamento(int id, double valor, Date data, String status) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.status = status;
    }

    public abstract boolean processar();

    public double getValor() {
        return valor;
    }

    // Getters e setters
    public int getId() { return id; }
    public Date getData() { return data; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}