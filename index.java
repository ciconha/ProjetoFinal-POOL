class Pessoa {
    private final String nome;
    private final String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

// Subclasse Aluno
class Aluno extends Pessoa {
    private final String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    // Getter para matrícula
    public String getMatricula() {
        return matricula;
    }
}

// Subclasse Professor
class Professor extends Pessoa {
    private final double salario;
    private final String disciplina;

    public Professor(String nome, String cpf, double salario, String disciplina) {
        super(nome, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    // Getters para salário e disciplina
    public double getSalario() {
        return salario;
    }

    public String getDisciplina() {
        return disciplina;
    }
}

// Classe Curso
class Curso {
    private final String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    // Getter para nome do curso
    public String getNome() {
        return nome;
    }
}

// Classe Aula
class Aula {
    private final String descricao;

    public Aula(String descricao) {
        this.descricao = descricao;
    }

    // Getter para descrição da aula
    public String getDescricao() {
        return descricao;
    }
}

public class EscolaDeIdiomas {
    public static void main(String[] args) {
        // Exemplo de uso
        Aluno aluno = new Aluno("João", "123456789", "2021001");
        Professor professor = new Professor("Maria", "987654321", 5000.0, "Inglês");
        Curso curso = new Curso("Inglês Básico");
        Aula aula = new Aula("Introdução ao vocabulário");

        System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        System.out.println("Professor: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Aula: " + aula.getDescricao());
    }
}
