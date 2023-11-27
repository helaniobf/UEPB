package Expert;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteRegistrarProfessorTrue {
    
    @Test
    public void TestRegistrarProfessorTrue(){
        ControleAcademico controle = new ControleAcademico();
        Disciplina map = new Disciplina("MAP", "QUI-16:00/18:00");
        controle.registrarDisciplina(map);
        Disciplina llp = new Disciplina("LLP", "TER-7:00/9:00");
        controle.registrarDisciplina(llp);
        Professor diogo = new Professor("Diogo");
        controle.registrarProfessor(diogo, map);        

        assertTrue(controle.registrarProfessor(diogo, llp));
    }

}
