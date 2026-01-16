import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date data;
    private String status;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Pagamento pagamento;

    public Pedido(int id, Date data, String status, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.status = status;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        cliente.adicionarPedido(this); // Agregação: adiciona o pedido ao cliente
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade); // Composição: cria ItemPedido dentro de Pedido
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void processarPagamento() {
        if (pagamento != null) {
            boolean sucesso = pagamento.processar();
            if (sucesso) {
                this.status = "Pago";
            }
        }
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Getters
    public int getId() { return id; }
    public Date getData() { return data; }
    public String getStatus() { return status; }
    public List<ItemPedido> getItens() { return itens; }
    public Pagamento getPagamento() { return pagamento; }
}
