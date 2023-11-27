import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TesteCriaTriangulo {
    
    @Test
    public void TestCriaTrianguloTrue(){

        Triangulo triangulo = Triangulo.SingletonTriangulo(3, 5, 7);
        assertNotNull(triangulo);

    }

    @Test
    public void TestCriaTrianguloFalse(){

        //Tenta criar dois triângulos equiláteros
        Triangulo triangulo = Triangulo.SingletonTriangulo(3, 3, 3);
        Triangulo Outrotriangulo = Triangulo.SingletonTriangulo(5, 5, 5);
        assertNull(Outrotriangulo);

    }

}
