package Expert;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteMatricularAlunoTrue {

    @Test
    public void TestMatricularAlunoTrue(){
        ControleAcademico controle = new ControleAcademico();
        Disciplina map = new Disciplina("MAP", "QUI-16:00/18:00");
        controle.registrarDisciplina(map);
        Disciplina llp = new Disciplina("LLP", "TER-7:00/9:00");
        controle.registrarDisciplina(llp);
        Aluno alberto = new Aluno("Alberto");
        controle.matricularAluno(alberto, map);

        assertTrue(controle.matricularAluno(alberto, llp));
    }

}