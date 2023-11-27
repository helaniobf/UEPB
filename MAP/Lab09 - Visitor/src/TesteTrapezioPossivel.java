import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TesteTrapezioPossivel {

    @Test(expected = IllegalArgumentException.class)
    public void TestTrapezioAPossivel() {
        Trapezio p = new Trapezio(0, 0, 0, 0, 0);
    }

}
