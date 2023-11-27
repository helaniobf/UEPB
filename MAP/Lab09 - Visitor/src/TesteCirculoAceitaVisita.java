import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCirculoAceitaVisita {

    Visitor visitorCA;
    Visitor visitorCP;
    Visitor visitorD;
    Visitor visitorMF;
    Circulo c;
    
    @Before
    public void setUp(){
        visitorCA = new VisitorCalcularArea();
        visitorCP = new VisitorCalcularPerimetro();
        visitorD = new VisitorDesenhar();
        visitorMF = new VisitorMaximizarFigura();

        c = new Circulo(4);
    }

    @Test
    public void TesteCirculoAceitaVisitaCA(){
        assertEquals(c.aceitaVisita(visitorCA), new Object[]{12.566370614359172});
    }

    @Test
    public void TesteCirculoAceitaVisitaCP(){
        assertEquals(c.aceitaVisita(visitorCP), new Object[]{25.132741228718345});
    }

    @Test
    public void TesteCirculoAceitaVisitaD(){
        assertEquals(c.aceitaVisita(visitorD), new Object[]{"   *****   \n" + " *       * \n" + "*         *\n" + " *       * \n" + "   *****   "});
    }

    @Test
    public void TesteCirculoAceitaVisitaMF(){
        assertEquals(c.aceitaVisita(visitorMF), new Object[]{8.0});
    }

}
