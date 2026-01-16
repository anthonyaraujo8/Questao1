import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criar cliente e produto
        Cliente cliente = new Cliente(1, "João Silva", "joao@email.com", "Rua A, 123");
        Produto produto = new Produto(1, "Notebook", 2500.00, 10);

        // Criar pedido
        Pedido pedido = new Pedido(1, new Date(), "Pendente", cliente);
        pedido.adicionarItem(produto, 2); // Adiciona item (composição)

        // Criar pagamento (exemplo com cartão)
        Pagamento pagamento = new Cartao(1, pedido.calcularTotal(), new Date(), "Pendente", "1234-5678-9012-3456", "12/25", "123");
        pedido.setPagamento(pagamento);

        // Processar pedido
        pedido.processarPagamento();
        System.out.println("Total do pedido: " + pedido.calcularTotal());
        System.out.println("Status do pedido: " + pedido.getStatus());
    }
}
