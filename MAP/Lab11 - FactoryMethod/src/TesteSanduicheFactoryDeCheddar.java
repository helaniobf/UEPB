import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class TesteSanduicheFactoryDeCheddar {
    
    SanduicheFactory sandubaFactory2;
    Sanduiche sanduiche2;

    @Before
    public void setUp(){
        sandubaFactory2 = new SanduicheFactoryDeCheddar();
        sanduiche2 = sandubaFactory2.criarSanduiche();
    }

    @Test
    public void TesteSanduicheFactoryDeFrangoCriado(){
        assertNotNull(sanduiche2);
    }

    @Test
    public void TesteSanduicheFactoryDeFrangoCorreto(){
        assertEquals(sanduiche2.mostrarIngredientes(), "Ingredientes do Sanduíche de Queijo Cheddar com Presunto de Frango\n" + 
                "- Pão: Pão Bola\n" +
                "- Queijo: Queijo Cheddar\n" +
                "- Presunto: Presunto de Frango\n" +
                "- Ovo: Ovo de Capoeira\n" + 
                "- Tomate: Tomate" );
    }

}
