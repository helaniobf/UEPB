package Testes;
import org.junit.Test;

import AcentosOnibusSource;

public class TesteAcentosOnibusExcecao {
    
    @Test(expected = IllegalArgumentException.class)
    public void TesteAcentosOnibusExcecaoCompra(){
        AcentosOnibusSource s = new AcentosOnibusSource();
        s.compraAcento(1);
        s.compraAcento(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TesteAcentosOnibusExcecaoReserva(){
        AcentosOnibusSource s = new AcentosOnibusSource();
        s.reservaAcento(15);
        s.reservaAcento(15);
    }

}
