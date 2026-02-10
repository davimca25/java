package ExerciciosCurso.Polimorfismo;

public class Notebook extends Product {

    private String model;

    public Notebook(String model) {
        super(model);
        this.model = model;
    }

    String getModel() {
        return model;
    }

    @Override
    void imposto(double valor, double tax) {
        System.out.println("Notebook: " + model);
        super.imposto(valor, tax);
    }
}
