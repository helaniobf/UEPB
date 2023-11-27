package Expert;
import java.util.ArrayList;

public class RDM{

    private ArrayList<Disciplina> disciplinaArray;

    public void RDM(ArrayList<Disciplina> disciplina) {
        this.disciplinaArray = new ArrayList<>(disciplina);
    }

    void mostrarAlunosTodasDisciplinas(ArrayList<Disciplina> disciplinaArray){
        for (Disciplina disciplina:disciplinaArray){
            System.out.println("Alunos matriculados em " + disciplina.getNome() + ":");
            for(Aluno alunoArray : disciplina.getAlunos()){
                System.out.println(alunoArray.getNome());
            }
        }
        System.out.println("");
    }

    void mostrarAlunos(Disciplina disciplina){
        System.out.println("Alunos matriculados em " + disciplina.getNome() + "(ESPECÍFICO):");
        for(Aluno alunoArray : disciplina.getAlunos()){
            System.out.println(alunoArray.getNome());
        }
        System.out.println("");
    }

    public void mostrarDisciplinasProfessor(Professor professor) {
        System.out.println("Disciplinas ministradas por Professor(a) " + professor.getNome() + ":");
        boolean professorMinistrando = false;

        for (Disciplina disciplina : disciplinaArray) {
            if (professor.equals(disciplina.getProfessor_Ministrante())) {
                System.out.println(disciplina.getNome() + " " + disciplina.getHorario());
                professorMinistrando = true;
            }
        }

        if (!professorMinistrando) {
            System.out.println("O professor não está ministrando disciplinas.");
        }

        System.out.println("");
    }

    public void mostrarDisciplinasAluno(Aluno aluno) {
        System.out.println("Disciplinas em que " + aluno.getNome() + " está matriculado:");
        boolean alunoMatriculado = false;

        for (Disciplina disciplina : disciplinaArray) {
            if (disciplina.getAlunos().contains(aluno)) {
                System.out.println(disciplina.getNome() + " " + disciplina.getHorario());
                alunoMatriculado = true;
            }
        }

        if (!alunoMatriculado) {
            System.out.println("O aluno não está matriculado em disciplinas.");
        }

        System.out.println("");
    }


    public void contarAlunos(Disciplina disciplina){
        int numeroDeAlunos = disciplina.contarAlunos();
        System.out.println("Número de alunos matriculados em " + disciplina.getNome() + ": " + numeroDeAlunos);
    }
}