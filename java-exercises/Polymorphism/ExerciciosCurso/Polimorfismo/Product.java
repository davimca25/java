package ExerciciosCurso.Polimorfismo;

public abstract class Product {
    public Product(String model) {
    }

    abstract String getModel();

    void imposto(double valor, double tax) {
        tax /= 100;
        double resultado = valor * tax;
        System.out.println("Valor do imposto: " + "R$" + resultado);
        System.out.println("-----------------");
    }
}