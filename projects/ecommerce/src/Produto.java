public class Produto {
    private String name;
    private double preco;

    public String getName() {
        return name;
    }
    public double getPreco() {
        return preco;
    }

    public Produto(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }
}
