import controler.Controlador;
import controler.ControladorQuiosque;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Uma ação no AcentosOnibusSource é realizada
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("(AcentosOnibusSource realizou uma acão)");
        PainelCentral p = new PainelCentral();
        AcentosOnibusSource s = new AcentosOnibusSource();
        s.adicionarListener(p);
        s.compraAcento(1);
        s.reservaAcento(15);

        //Uma ação no Painel Central é realizada
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("(Painel Central realizou uma acão)");
        Controlador co = new Controlador();
        co.setControlador(s);
        p.setListener(co); 
        p.comprarAcento(2);

        //Uma ação no AcentosQuiosqueSource é realizada
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("(AcentosQuiosqueSource realizou uma acão)");
        Quiosque q = new Quiosque();
        AcentosQuiosqueSource qs = new AcentosQuiosqueSource();
        qs.adicionarListener(q);
        qs.compraAcento(1);
        qs.reservaAcento(2);

        //Uma ação no Quiosque é realizada
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("(Quiosque realizou uma acão)");
        System.out.println("Terceiro Teste:");
        ControladorQuiosque cq = new ControladorQuiosque();
        cq.setControlador(qs);
        q.setListener(cq);
        q.comprarAcento(5);
    }
}
