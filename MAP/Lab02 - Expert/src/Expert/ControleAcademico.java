package Expert;

import java.util.ArrayList;

public class ControleAcademico {

    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public boolean matricularAluno(Aluno aluno, Disciplina disciplina) {

        //Verifica se o aluno já está matriculado em uma disciplina no mesmo horário
        for(Disciplina disciplinaArray : disciplinas){
            for(Aluno alunoArray : disciplinaArray.getAlunos()){
                if(alunoArray.equals(aluno)){
                    if(disciplinaArray.getHorario().equals(disciplina.getHorario())){
                        return false;
                    }
                }
            }
        }
        disciplina.matricular(aluno);
        return true;

    }

    public boolean registrarProfessor(Professor professor, Disciplina disciplina){

        //Verifica se o professor já está matriculado em uma disciplina no mesmo horário
        for(Disciplina disciplinaArray : disciplinas){
            if(professor.equals(disciplinaArray.getProfessor_Ministrante())){
                if(disciplinaArray.getHorario().equals(disciplina.getHorario())){
                    return false;
                }
            }
        }
        disciplina.registrarProfessor(professor);
        return true;

    }

    public ArrayList<Disciplina> getDisciplinas(){
        return this.disciplinas;
    }

    public void registrarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
}