import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double subtotal;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = calcularSubtotal();
    }

    public double calcularSubtotal() {
        this.subtotal = produto.getPreco() * quantidade;
        return subtotal;
    }

    public Produto getProduto() {
        return produto;
    }

    // Getters
    public int getQuantidade() { return quantidade; }
    public double getSubtotal() { return subtotal; }
}