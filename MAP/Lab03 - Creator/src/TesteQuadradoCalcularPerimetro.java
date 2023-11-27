import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteQuadradoCalcularPerimetro{
    
    @Test
    public void testQuadradoCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(28, quadrado.calcularPerimetro(),0.01);
    }
}