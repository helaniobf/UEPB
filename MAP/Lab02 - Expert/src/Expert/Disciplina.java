package Expert;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private String horario;
    private Professor professor_ministrante;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor_Ministrante() {
        return professor_ministrante;
    }

    public void registrarProfessor(Professor professor) {
        this.professor_ministrante = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int contarAlunos() {
        return alunos.size();
    }
}