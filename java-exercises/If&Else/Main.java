import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salario = scanner.nextDouble();

        calcularTaxas(salario);
        scanner.close();
    }

    public static void calcularTaxas(double valor) {
        double tax1 = 9.70 / 100;
        double tax2 = 37.35 / 100;
        double tax3 = 49.50 / 100;
        double salarioBruto = valor;


        if (valor < 34712) {
            valor *= tax1;
        } else if (valor >= 34712 && valor < 68507) {
            valor *= tax2;
        } else {
            valor *= tax3;
        }
        double salarioLiquido = salarioBruto - valor;
        System.out.printf("Taxa de Imposto: %.2f", valor);
        System.out.printf("\nSalário final: $%.1f", salarioLiquido);
    }
}