package controler;
import org.w3c.dom.events.Event;

public interface ListenerControlador extends java.util.EventListener{
    
    public void novaCompra(PainelCentralEvent e, int id);
    public void novaReserva(PainelCentralEvent e, int id);

}
