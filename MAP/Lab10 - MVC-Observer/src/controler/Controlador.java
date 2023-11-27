package controler;

import AcentosOnibusSource;
import PainelCentralEvent;

public class Controlador implements ListenerControlador {
    
    AcentosOnibusSource s;

    public Controlador(){
    }

    public void novaCompra(PainelCentralEvent e, int id){
        s.compraAcento(id);
    }

    public void novaReserva(PainelCentralEvent e, int id){
        s.reservaAcento(id);
    }

    public void setControlador(AcentosOnibusSource s){
        this.s = s;
    }

}
