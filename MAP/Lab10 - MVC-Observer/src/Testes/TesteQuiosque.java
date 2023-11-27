package Testes;
import org.junit.Test;

import AcentosQuiosqueSource;
import Quiosque;

import static org.junit.Assert.*;

import org.junit.Before;

public class TesteQuiosque {
    
    AcentosQuiosqueSource s;
    Quiosque q;

    @Before
    public void setUp(){
        s = new AcentosQuiosqueSource();
        q = new Quiosque();
    }

    @Test
    public void TestQuiosqueOnibusDispara(){
        s.compraAcento(1);
    }

    @Test
    public void TesteAcentosQuiosqueCompra(){
        s.compraAcento(1);
        assertEquals("Indisponível", s.getAcentos().get(0).getSituacao() );
    }

    @Test
    public void TesteAcentosQuiosqueReserva(){
        s.reservaAcento(1);
        assertEquals("Reservado", s.getAcentos().get(0).getSituacao() );
    }

}



