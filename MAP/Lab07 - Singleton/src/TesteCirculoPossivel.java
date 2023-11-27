import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

public class TesteCirculoPossivel {

    @Test
    public void TestCirculoPossivel(){

        Circulo circulo = Circulo.SingletonCirculo(0);
        assertNull(circulo );

    }

}
