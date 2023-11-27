import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TesteRetanguloInvalidoFalse {
    
    @Test
    public void TestRetanguloInvalidoFalse(){
        assertNotNull(new Retangulo(5, 10));
    }

}
