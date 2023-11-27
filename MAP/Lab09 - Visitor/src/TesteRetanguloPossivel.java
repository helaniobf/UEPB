import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TesteRetanguloPossivel {
    
    @Test(expected = IllegalArgumentException.class)
    public void TestRetanguloAPossivel() {
        Retangulo r = new Retangulo(0, 0);
    }

}
