import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRetanguloCalcularPerimetro {
    
        @Test
    public void testRetanguloCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(5,10);
        assertEquals(30, retangulo.calcularPerimetro(), 0.01);
    }

}
