import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteRetanguloAceitaVisita {
    
    Visitor visitorCA;
    Visitor visitorCP;
    Visitor visitorD;
    Visitor visitorMF;
    Retangulo r;

    @Before
    public void setUp(){
        visitorCA = new VisitorCalcularArea();
        visitorCP = new VisitorCalcularPerimetro();
        visitorD = new VisitorDesenhar();
        visitorMF = new VisitorMaximizarFigura();

        r = new Retangulo(3, 2);
    }

    @Test
    public void TesteTrapezioAceitaVisitaCA(){
        assertEquals(r.aceitaVisita(visitorCA), new Object[]{6.0});
    }

    @Test
    public void TesteTrapezioAceitaVisitaCP(){
        assertEquals(r.aceitaVisita(visitorCP), new Object[]{5.0});
    }

    @Test
    public void TesteTrapezioAceitaVisitaD(){
        assertEquals(r.aceitaVisita(visitorD), new Object[]{"********\n" + "*      *\n" + "********"});
    }

    @Test
    public void TesteTrapezioAceitaVisitaMF(){
        assertEquals(r.aceitaVisita(visitorMF), new Object[]{4.0, 6.0});
    }

}
