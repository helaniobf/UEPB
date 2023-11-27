
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class TesteCadastraFuncionario {
    
    @Test
    public void TestCadastraFuncionario(){
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Funcionario funcionario1 = new Funcionario("Alberto", "001");
        funcionarios.add(funcionario1);

        assertTrue(funcionarios.contains(funcionario1));
    }

}
