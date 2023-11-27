package Testes;
import org.junit.Test;

import AcentosOnibusSource;
import PainelCentral;

import static org.junit.Assert.*;

import org.junit.Before;

public class TesteAcentosOnibus {
    
    AcentosOnibusSource s;
    PainelCentral p;

    @Before
    public void setUp(){
        s = new AcentosOnibusSource();
        p = new PainelCentral();
    }

    @Test
    public void TestAcentosOnibusDispara(){
        s.compraAcento(1);
    }

    @Test
    public void TesteAcentosOnibusCompra(){
        s.compraAcento(1);
        assertEquals("vermelho", s.getAcentos().get(0).getSituacao() );
    }

    @Test
    public void TesteAcentosOnibusReserva(){
        s.reservaAcento(1);
        assertEquals("amarelo", s.getAcentos().get(0).getSituacao() );
    }

}


