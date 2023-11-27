import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class TesteCriaCirculo {
    
    @Test
    public void TestCriaCirculoTrue(){

        Circulo circulo = Circulo.SingletonCirculo(4);
        assertNotNull(circulo );

    }

    @Test
    public void TestCriaCirculoFalse(){

        //Tenta criar dois círculos
        Circulo circulo = Circulo.SingletonCirculo(4);
        Circulo OutroCirculo = Circulo.SingletonCirculo(2);
        assertNull(OutroCirculo);

    }    

}
