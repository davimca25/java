package CursoJava;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa física"), PESSOA_JURIDICA(2, "Pessoa jurídica");

    private final int valor;
    private final String name;

    TipoCliente(int valor, String name) {
        this.valor = valor;
        this.name = name;
    }

    public int getValor() {
        return valor;
    }

    public String getName() {
        return name;
    }

    public static TipoCliente obterTipoDeClientePorNome(String name) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getName().equals(name)) {
                return tipoCliente;
            }
        }
    return null;
    }
}
