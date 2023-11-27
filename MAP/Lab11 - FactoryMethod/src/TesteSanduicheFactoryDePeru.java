import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class TesteSanduicheFactoryDePeru {

    SanduicheFactory sandubaFactory3;
    Sanduiche sanduiche3;

    @Before
    public void setUp(){
        sandubaFactory3 = new SanduicheFactoryDePeru();
        sanduiche3 = sandubaFactory3.criarSanduiche();
    }

    @Test
    public void TesteSanduicheFactoryDeFrangoCriado(){
        assertNotNull(sanduiche3);
    }

    @Test
    public void TesteSanduicheFactoryDeFrangoCorreto(){
        assertEquals(sanduiche3.mostrarIngredientes(), "Ingredientes do Sanduíche de Queijo Mussarela com Presunto de Peru\n" + 
                "- Pão: Pão Francês\n" +
                "- Queijo: Queijo Mussarela\n" +
                "- Presunto: Presunto de Peru\n" +
                "- Ovo: Ovo de Granja\n" + 
                "- Tomate: Tomate" );
    }

}
