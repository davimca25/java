package CursoJava;

public class Cliente {
    private String name;
    private TipoCliente tipoCliente;

    public Cliente(String name, TipoCliente tipoCliente) {
        this.name = name;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + tipoCliente +
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
