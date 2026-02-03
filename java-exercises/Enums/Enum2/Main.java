package CursoJava;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Davi", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Euri", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getName());
        System.out.println(TipoCliente.obterTipoDeClientePorNome("Pessoa jurídica"));
    }
}
