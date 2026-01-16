import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String endereco;
    private List<Pedido> pedidos;

    public Cliente(int id, String nome, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    // Getters e setters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getEndereco() { return endereco; }
}
