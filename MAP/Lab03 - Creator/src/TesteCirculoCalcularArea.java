import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCirculoCalcularArea{
    
    @Test
    public void testCirculoCalcularArea() {
        Circulo circulo = new Circulo(5);
        assertEquals(78.53, circulo.calcularArea(), 0.01); // Verifica se a área é aproximadamente igual a 78.53 com uma margem de erro de 0.01
    }
}