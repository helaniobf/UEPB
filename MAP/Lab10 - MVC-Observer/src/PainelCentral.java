import javax.xml.transform.Source;

import controler.ListenerControlador;

public class PainelCentral implements ListenerOnibus{

    private ListenerControlador  lc;

    public void comprarAcento(int id){
        disparaComprarAcento(id);
    }

    public void reservarAcento(int id){
        disparaReservarAcento(id);
    }

    private synchronized void disparaComprarAcento(int id){
        PainelCentralEvent e = new PainelCentralEvent(this);
        lc.novaCompra(e, id);
    }

    private synchronized void disparaReservarAcento(int id){
        PainelCentralEvent e = new PainelCentralEvent(this);
        lc.novaReserva(e, id);
    }

    public void setListener(ListenerControlador c){
        this.lc= c;
    }

    public void novaCompra(AcentosOnibusEvent e){
        AcentosOnibusSource s = (AcentosOnibusSource) e.getSource();
        System.out.println("Informações dos acentos atualizadas!");
        apresentaDisposicao(s);
    }

    public void novaReserva(AcentosOnibusEvent e){
        AcentosOnibusSource s = (AcentosOnibusSource) e.getSource();
        System.out.println("Informações dos acentos atualizadas!");
        apresentaDisposicao(s);
    }

    public void apresentaDisposicao(AcentosOnibusSource s){
        for( Acento a : s.getAcentos() ){
            System.out.println("Situação do acento " + a.getId() + ": " + a.getSituacao());
        }
    }
}
