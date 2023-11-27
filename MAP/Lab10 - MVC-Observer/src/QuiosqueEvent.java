import java.util.EventObject;

public class QuiosqueEvent extends EventObject {
    
    public QuiosqueEvent(Quiosque q){
        super(q);
    }
}