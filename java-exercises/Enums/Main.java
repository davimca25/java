package CursoJava;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Davi", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Euri", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
    }
}
