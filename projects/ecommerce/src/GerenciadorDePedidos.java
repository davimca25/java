import java.util.ArrayList;
import java.util.List;

public class GerenciadorDePedidos {
    private List<Pedido> todosOsPedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        todosOsPedidos.add(pedido);
        System.out.println("Pedido adicionado.");
    }

    public void concluirPedido(int id) {
        for (Pedido pedido : todosOsPedidos) {
            if (pedido.getId() == id) {
                if (!pedido.getProdutos().isEmpty()) {
                    pedido.setStatus(StatusPedido.CONCLUIDO);
                    System.out.println("Pedido " + id + " concluído.");
                    return;
                } else {
                    throw new PedidoInvalidoException("Não é possível concluir um pedido vazio.");
                }
            }
        }
        System.out.println("Pedido " + id + " não encontrado.");
    }

    public List<Pedido> filtrarPorStatus(StatusPedido status) {
        return todosOsPedidos.stream().filter(pedido -> pedido.getStatus() == status).toList();

    }

    public double calcularFaturamentoTotal() {
        return todosOsPedidos.stream()
                .filter(pedido -> pedido.getStatus() == StatusPedido.CONCLUIDO)
                .flatMap(pedido -> pedido.getProdutos().stream())
                .mapToDouble(Produto::getPreco)
                .sum();
    }
}
