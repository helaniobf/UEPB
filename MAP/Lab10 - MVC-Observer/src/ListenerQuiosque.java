import org.w3c.dom.events.Event;

public interface ListenerQuiosque extends java.util.EventListener {
    
    public void novaCompra(AcentosQuiosqueEvent s);
    public void novaReserva(AcentosQuiosqueEvent s);

}