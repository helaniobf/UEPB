import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteSIGDocente {
    
    @Test
    public void TestSIGDisciplinas(){
        assertEquals("[Exibindo Disciplinas]", SIG.obterDisciplinas());
    }

    @Test
    public void TestSIGTempoDeCasa(){
        assertEquals("[Exibindo Tempo de Casa]", SIG.obterTempoDeCasa());
    }
    
}
