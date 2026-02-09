package CursoJava;

public class Professor {
    private String name;
    private String subject;
    private Seminario[] seminarios;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public Professor(String name, String subject, Seminario[] seminarios) {
        this.name = name;
        this.subject = subject;
        this.seminarios = seminarios;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Professor: " + this.name);

        if (this.seminarios == null) {
            return;
        }
        System.out.println("Seminários cadastrados: ");
        for (Seminario seminario : seminarios) {
            System.out.println("-------------");
            System.out.println("Nome: " + seminario.getName());
            System.out.println("Endereço: " + seminario.getLocal());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {
                continue;
            }
            System.out.println("Alunos: ");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getName() + " Idade: " + aluno.getIdade());
            }
        }
    }
}
