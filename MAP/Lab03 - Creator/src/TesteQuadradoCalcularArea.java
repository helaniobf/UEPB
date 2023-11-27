import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteQuadradoCalcularArea{
    
    @Test
    public void testQuadradoCalcularArea() {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(49, quadrado.calcularArea(),0.01);
    }
}