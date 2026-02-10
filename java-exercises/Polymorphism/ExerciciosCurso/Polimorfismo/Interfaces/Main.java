package ExerciciosCurso.Polimorfismo.Interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repositorio repositorio;
        System.out.println("memoria|banco\n:");
        String entrada = scanner.nextLine();
        if (entrada.equalsIgnoreCase("memoria")) {
            repositorio = new RepositorioMemoria();
            repositorio.salvar();
        } else if (entrada.equalsIgnoreCase("banco")) {
            repositorio = new RepositorioBancoDeDados();
            repositorio.salvar();
        }
    }
}
