package ExerciciosCurso.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Notebook("ThinkPad");
        Product product2 = new Computer("Gigabyte");
        Product product3 = new Phone("Iphone");

        product1.imposto(3299,10);
        product2.imposto(4399,10);
        product3.imposto(4199, 10);

        System.out.println(product1.getModel());
        System.out.println(product2.getModel());
        System.out.println(product3.getModel());

    }
}
