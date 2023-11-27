import org.junit.Test;

public class TesteRetanguloInvalidoTrue {
    
    @Test(expected = IllegalArgumentException.class)
    public void testRetanguloInvalidoTrue() {
        new Retangulo(0,5);
    }

}
