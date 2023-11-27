import org.junit.Test;

public class TesteQuadradoInvalidoTrue {
    
    @Test(expected = IllegalArgumentException.class)
    public void testQuadradoInvalidoTrue() {
        new Quadrado(0);
    }

}
