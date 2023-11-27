import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCirculoCalcularPerimetro{
    
    @Test
    public void testCirculoCalcularPerimetro() {
        Circulo circulo = new Circulo(5);
        assertEquals(31.42, circulo.calcularPerimetro(), 0.01); // Verifica se o perímetro é aproximadamente igual a 31.42 com uma margem de erro de 0.01
    }
}