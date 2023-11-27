import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteSIGAdministrativo {

    @Test
    public void TestSIGReunioes(){
        assertEquals("[Exibindo Reunioes]", SIG.obterReunioes());
    }

    @Test
    public void TestSIGEntrevistas(){
        assertEquals("[Exibindo Entrevistas]", SIG.obterEntrevistas());
    }

}
