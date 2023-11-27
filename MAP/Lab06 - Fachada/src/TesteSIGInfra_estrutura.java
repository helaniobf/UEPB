import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteSIGInfra_estrutura {
    
    @Test
    public void TestSIGAlocacoesDeSala(){
        assertEquals("[Exibindo Alocacoes de Sala]", SIG.obterAlocacoesDeSala());
    }

}
