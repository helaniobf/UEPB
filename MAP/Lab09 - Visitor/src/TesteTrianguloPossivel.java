import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TesteTrianguloPossivel {
    
    @Test(expected = IllegalArgumentException.class)
    public void TestTrianguloAPossivel() {
        Triangulo t = new Triangulo(0, 0, 0);
    }
    
}
