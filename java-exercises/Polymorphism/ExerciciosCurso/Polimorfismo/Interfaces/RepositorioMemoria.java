package ExerciciosCurso.Polimorfismo.Interfaces;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando na memória.");

    }
}
