import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteTrapezioAceitaVisita {
    
    Visitor visitorCA;
    Visitor visitorCP;
    Visitor visitorD;
    Visitor visitorMF;
    Trapezio p;

    @Before
    public void setUp(){
        visitorCA = new VisitorCalcularArea();
        visitorCP = new VisitorCalcularPerimetro();
        visitorD = new VisitorDesenhar();
        visitorMF = new VisitorMaximizarFigura();

        p = new Trapezio(4, 3, 5, 2, 2);
    }

    @Test
    public void TesteTrapezioAceitaVisitaCA(){
        assertEquals(p.aceitaVisita(visitorCA), new Object[]{17.5});
    }

    @Test
    public void TesteTrapezioAceitaVisitaCP(){
        assertEquals(p.aceitaVisita(visitorCP), new Object[]{11.0});
    }

    @Test
    public void TesteTrapezioAceitaVisitaD(){
        assertEquals(p.aceitaVisita(visitorD), new Object[]{"   *****\n" + "  *     *\n" + " *       *\n" + "***********"});
    }

    @Test
    public void TesteTrapezioAceitaVisitaMF(){
        assertEquals(p.aceitaVisita(visitorMF), new Object[]{4.0, 4.0, 6.0, 8.0});
    }

}
