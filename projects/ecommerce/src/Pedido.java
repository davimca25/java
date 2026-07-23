import java.util.List;

public class Pedido {
    private int id;
    private List<Produto> produtos;
    private StatusPedido status;

    public int getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Pedido(int id, List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
        this.status = StatusPedido.PENDENTE;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
