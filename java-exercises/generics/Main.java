public class Main {
    public static void main(String[] args) {
        Box<String, Double> object  = new Box<>();

        object.setObject("Notebook");
        object.setPrice(2499.99);

        System.out.println(object.getObject() + ": R$" + object.getPrice());



    }
}