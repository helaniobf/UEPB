package controler;
import org.w3c.dom.events.Event;

public interface ListenerControladorQuiosque extends java.util.EventListener{
    
    public void novaCompra(QuiosqueEvent e, int id);
    public void novaReserva(QuiosqueEvent e, int id);

}
