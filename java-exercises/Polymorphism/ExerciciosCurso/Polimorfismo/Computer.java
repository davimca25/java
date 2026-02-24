package ExerciciosCurso.Polimorfismo;

public class Computer extends Product {

    private String model;

    public Computer(String model) {
        super(model);
        this.model = model;
    }


    String getModel() {
        return model;
    }

    @Override
    void imposto(double valor, double tax) {
        System.out.println("Computer: " + model);
        super.imposto(valor, tax);
    }
}
