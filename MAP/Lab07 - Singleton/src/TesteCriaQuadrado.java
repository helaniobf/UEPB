import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class TesteCriaQuadrado {
 
    @Test
    public void TestCriaQuadradoTrue(){

        Quadrado quadrado = new Quadrado(5);
        assertNotNull(quadrado);

    }    

}
