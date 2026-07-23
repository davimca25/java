import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Produto produto1 = new Produto("Cereal", 19.99);
        Produto produto2= new Produto("Macarrão", 9.99);
        Produto produto3 = new Produto("Nescau",  7.50);

        List<Produto> produtos1 = List.of(produto1, produto2, produto3);
        List<Produto> produtos2 = List.of();

        Pedido pedido1 = new Pedido(1, produtos1);
        Pedido pedido2 = new Pedido(2, produtos2);

        GerenciadorDePedidos gerenciadorDePedidos = new GerenciadorDePedidos();

        gerenciadorDePedidos.adicionarPedido(pedido1);
        gerenciadorDePedidos.adicionarPedido(pedido2);

        try {
            gerenciadorDePedidos.concluirPedido(1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        try {
            gerenciadorDePedidos.concluirPedido(2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(gerenciadorDePedidos.calcularFaturamentoTotal());
    }
}