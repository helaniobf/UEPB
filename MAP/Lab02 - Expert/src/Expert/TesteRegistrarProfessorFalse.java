package Expert;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteRegistrarProfessorFalse {

    @Test
    public void TestRegistrarProfessorFalse(){
        ControleAcademico controle = new ControleAcademico();
        Disciplina llp = new Disciplina("LLP", "TER-7:00/9:00");
        controle.registrarDisciplina(llp);
        Disciplina llp2 = new Disciplina("LLP2", "TER-7:00/9:00");
        controle.registrarDisciplina(llp2);
        Professor diogo = new Professor("Diogo");
        controle.registrarProfessor(diogo, llp);

        assertFalse(controle.registrarProfessor(diogo, llp2));
    }

}