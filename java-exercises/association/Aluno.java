package CursoJava;

public class Aluno {
    private String name;
    private int idade;
    private Seminario seminario;

    public Aluno(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }
}
