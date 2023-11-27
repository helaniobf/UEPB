package controler;

import AcentosQuiosqueSource;
import QuiosqueEvent;

public class ControladorQuiosque implements ListenerControladorQuiosque {
    
    AcentosQuiosqueSource s;

    public void novaCompra(QuiosqueEvent e, int id){
        s.compraAcento(id);
    }

    public void novaReserva(QuiosqueEvent e, int id){
        s.reservaAcento(id);
    }

    public void setControlador(AcentosQuiosqueSource s){
        this.s = s;
    }

}