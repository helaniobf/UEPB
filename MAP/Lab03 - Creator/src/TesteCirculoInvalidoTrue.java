
import org.junit.Test;

public class TesteCirculoInvalidoTrue {
    
    @Test(expected = IllegalArgumentException.class)
    public void testCirculoInvalidoTrue() {
        new Circulo(0);
    }
}
