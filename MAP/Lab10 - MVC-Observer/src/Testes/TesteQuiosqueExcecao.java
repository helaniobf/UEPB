package Testes;
import org.junit.Test;

import AcentosQuiosqueSource;

public class TesteQuiosqueExcecao {
    
    @Test(expected = IllegalArgumentException.class)
    public void TesteAcentosQuiosqueExcecaoCompra(){
        AcentosQuiosqueSource s = new AcentosQuiosqueSource();
        s.compraAcento(1);
        s.compraAcento(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TesteAcentosQuiosqueExcecaoReserva(){
        AcentosQuiosqueSource s = new AcentosQuiosqueSource();
        s.reservaAcento(15);
        s.reservaAcento(15);
    }

}
