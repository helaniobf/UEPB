import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteSIGAlmoxarifado {
   
    @Test
    public void TestSIGEstoque(){
        assertEquals("[Exibindo Estoque]", SIG.obterEstoque());
    }

    @Test
    public void TestSIGPedidosDeCompra(){
        assertEquals("[Exibindo Pedidos de Compra]", SIG.obterPedidosDeCompra());
    }  

}
