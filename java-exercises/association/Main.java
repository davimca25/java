package CursoJava;

public class Main {
    public static void main() {

        Professor professor1 = new Professor("Marcos", "Matemática");
        Professor professor2 = new Professor("Nelson", "Filosofia");

        Aluno aluno1 = new Aluno("Davi", 6);
        Aluno aluno2 = new Aluno("Julia", 6);
        Aluno aluno3 = new Aluno("Gabriel", 6);
        Aluno aluno4 = new Aluno("Thiago", 6);

        Professor[] professores = {professor1, professor2};

        Aluno[] alunos1 = {aluno1, aluno2};
        Aluno[] alunos2 = {aluno3, aluno4};

        Local local1 = new Local("Lagoa");
        Local local2 = new Local("Maracãna");

        Seminario seminario1 = new Seminario("Cap", local1, alunos1);
        Seminario seminario2 = new Seminario("Uerj", local2, alunos2);

        Seminario[] seminarios = {seminario1, seminario2};

        professor1.setSeminarios(seminarios);

        professor1.imprime();



    }
}