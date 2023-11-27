import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteSanduicheFactoryDeFrango {
    
    SanduicheFactory sandubaFactory1;
    Sanduiche sanduiche1;

    @Before
    public void setUp(){
        sandubaFactory1 = new SanduicheFactoryDeFrango();
        sanduiche1 = sandubaFactory1.criarSanduiche();
    }

    @Test
    public void TesteSanduicheFactoryDeFrangoCriado(){
        assertNotNull(sanduiche1);
    }

    @Test
    public void TesteSanduicheFactoryDeFrangoCorreto(){
        assertEquals(sanduiche1.mostrarIngredientes(), "Ingredientes do Sanduíche de Queijo Prato com Presunto de Frango\n" + 
                "- Pão: Pão Integral\n" +
                "- Queijo: Queijo Prato\n" +
                "- Presunto: Presunto de Frango\n" +
                "- Ovo: Ovo de Capoeira\n" + 
                "- Tomate: Tomate" );
    }

}
