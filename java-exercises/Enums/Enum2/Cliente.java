package CursoJava;

public class Cliente {
    private String name;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String name, TipoCliente tipoCliente) {
        this.name = name;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String name, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name ='" + name + '\'' +
                ", tipo cliente=" + tipoCliente.getName() +
                ", tipo cliente valor=" + tipoCliente.getValor() +
                ", tipo pagamento =" + tipoPagamento +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
