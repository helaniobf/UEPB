import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCirculoPossivel {
    
    @Test(expected = IllegalArgumentException.class)
    public void TestCirculoAPossivel() {
        Circulo c = new Circulo(0);
    }

}
