import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteSIGDiscente {
    
    @Test
    public void TestSIGHistorico(){
        assertEquals("[Exibindo Historico]", SIG.obterHistorico());
    }

    @Test
    public void TestSIGRDM(){
        assertEquals("[Exibindo RDM]", SIG.obterRDM());
    }

}
