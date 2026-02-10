package ExerciciosCurso.Polimorfismo.Interfaces;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados.");

    }
}
