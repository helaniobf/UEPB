import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class TesteQuadradoPossivel {
    
   @Test(expected = IllegalArgumentException.class)
    public void TestQuadradoPossivel(){

        Quadrado quadrado = new Quadrado(-2);
        assertNull(quadrado);

    }

}
