import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteTrianguloAceitaVisita {
    
    Visitor visitorCA;
    Visitor visitorCP;
    Visitor visitorD;
    Visitor visitorMF;
    Triangulo t;

    @Before
    public void setUp(){
        visitorCA = new VisitorCalcularArea();
        visitorCP = new VisitorCalcularPerimetro();
        visitorD = new VisitorDesenhar();
        visitorMF = new VisitorMaximizarFigura();

        t = new Triangulo(5, 5, 5);
    }

    @Test
    public void TesteTrianguloAceitaVisitaCA(){
        assertEquals(t.aceitaVisita(visitorCA), new Object[]{10.825317547305483});
    }

    @Test
    public void TesteTrianguloAceitaVisitaCP(){
        assertEquals(t.aceitaVisita(visitorCP), new Object[]{15.0});
    }

    @Test
    public void TesteTrianguloAceitaVisitaD(){
        assertEquals(t.aceitaVisita(visitorD), new Object[]{"    *    \n" + "   * *   \n" + "  *   *  \n" + " *     * \n" + "*********"});
    }

    @Test
    public void TesteTrianguloAceitaVisitaMF(){
        assertEquals(t.aceitaVisita(visitorMF), new Object[]{10.0, 5.0, 5.0});
    }

}
