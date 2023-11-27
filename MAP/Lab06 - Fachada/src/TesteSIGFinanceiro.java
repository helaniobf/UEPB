import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteSIGFinanceiro{

    @Test
    public void TestSIGBalancoDeContas(){
        assertEquals("[Exibindo Balanço de Contas]", SIG.obterBalancoDeContas());
    }

    @Test
    public void TestSIGFolhaDePagamento(){
        assertEquals("[Exibindo Folha de Pagamento]", SIG.obterFolhaDePagamento());
    }

}