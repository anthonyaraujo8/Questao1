import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void atualizarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    public double getPreco() {
        return preco;
    }

    // Getters e setters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getEstoque() { return estoque; }
}
