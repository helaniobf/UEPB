package Expert;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteMatricularAlunoFalse {
    
    @Test
    public void TestMatricularAlunoFalse(){
        ControleAcademico controle = new ControleAcademico();
        Disciplina llp = new Disciplina("LLP", "TER-7:00/9:00");
        controle.registrarDisciplina(llp);
        Disciplina llp2 = new Disciplina("LLP2", "TER-7:00/9:00");
        controle.registrarDisciplina(llp2);        
        Aluno alberto = new Aluno("Alberto");
        controle.matricularAluno(alberto, llp);

        assertFalse(controle.matricularAluno(alberto, llp2));
    }

}
