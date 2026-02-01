package CursoJava;

public class Seminario {
    private String name;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String name, Local local) {
        this.name = name;
        this.local = local;
    }

    public Seminario(String name, Local local, Aluno[] alunos) {
        this(name, local);
        this.alunos = alunos;

    }

    public void imprime() {
      System.out.println("Nome: " + getName());
      System.out.println("Local: " + local.getEndereço());
      if (alunos == null) {
          return;
      }
      System.out.println("Alunos: ");
      for (Aluno aluno : alunos) {
          System.out.println(aluno.getName());
      }
    }

    public String getName() {
        return name;
    }

    public String getLocal() {
        return local.getEndereço();
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}
