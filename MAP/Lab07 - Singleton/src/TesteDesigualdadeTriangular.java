import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class TesteDesigualdadeTriangular {

    @Test
    public void TestDesigualdadeTriangular(){

        Triangulo triangulo = Triangulo.SingletonTriangulo(1, 2, 3);
        assertNull(triangulo);

    }

}
