import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRetanguloCalcularArea {
    
    @Test
    public void testRetanguloCalcularArea() {
        Retangulo retangulo = new Retangulo(5,10);
        assertEquals(50, retangulo.calcularArea(), 0.01);
    }

}
