package ExerciciosCurso.Polimorfismo;

public class Phone extends Product {

    private String model;

    public Phone(String model) {
        super(model);
        this.model = model;
    }


    String getModel() {
        return model;
    }

    @Override
    void imposto(double valor, double tax) {
        System.out.println("Phone: " + model);
        super.imposto(valor, tax);
    }
}
