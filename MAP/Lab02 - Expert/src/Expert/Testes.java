package Expert;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {

	@Test
    public void testAdicionarAlunoDisciplina() {
        Aluno aluno = new Aluno("João");
        Disciplina disciplina = new Disciplina("Matemática", "Segunda-feira", new Professor("Prof. Silva"));

        disciplina.matricular(aluno);
        ArrayList<Aluno> alunosDisciplina = disciplina.getAlunos();

        assertTrue(alunosDisciplina.contains(aluno));
    }
	
    @Test
    public void testAdicionarDisciplinaAluno() {
        Aluno aluno = new Aluno("João");
        Disciplina disciplina = new Disciplina("Matemática", "Segunda-feira", new Professor("Prof. Silva"));

        aluno.matricular(disciplina);
        ArrayList<Disciplina> disciplinasAluno = aluno.getDisciplinas();

        assertTrue(disciplinasAluno.contains(disciplina));
    }
    
    @Test
    public void testAdicionarDisciplinaProfessor() {
        Professor professor = new Professor("Prof. Silva");
        Disciplina disciplina = new Disciplina("Matemática", "Segunda-feira", professor);

        Professor professorDisciplina = disciplina.getProfessor_Ministrante();

        assertEquals(professor, professorDisciplina);
    }
    
    @Test
    public void testAdicionarProfessorDisciplina() {
        Professor professor = new Professor("Prof. Silva");
        Disciplina disciplina = new Disciplina("Matemática", "Segunda-feira", professor);

        Professor professorDisciplina = disciplina.getProfessor_Ministrante();

        assertEquals(professor, professorDisciplina);
    }
    
    @Test
    public void testMatricularDisciplinaComMesmoHorario() {
    	Aluno aluno = new Aluno("João");
    	Disciplina disciplina1 = new Disciplina("Matemática", "08:00", new Professor("Prof. Silva"));
        Disciplina disciplina2 = new Disciplina("Física", "08:00", new Professor("Prof. Pereira"));
        
        assertTrue(aluno.matricular(disciplina1));
        assertFalse(aluno.matricular(disciplina2)); 
    }
    
    
}

