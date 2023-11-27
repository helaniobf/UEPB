import javax.xml.transform.Source;

import controler.ListenerControladorQuiosque;

public class Quiosque implements ListenerQuiosque{

	private ListenerControladorQuiosque lc;

    public void comprarAcento(int id){
        disparaComprarAcento(id);
    }

    public void reservarAcento(int id){
        disparaReservarAcento(id);
    }

    private synchronized void disparaComprarAcento(int id){
        QuiosqueEvent e = new QuiosqueEvent(this);
        lc.novaCompra(e, id);
    }

    private synchronized void disparaReservarAcento(int id){
        QuiosqueEvent e = new QuiosqueEvent(this);
        lc.novaReserva(e, id);
    }

    public void setListener(ListenerControladorQuiosque c){
        this.lc= c;
    }


    public void novaCompra(AcentosQuiosqueEvent e){
        AcentosQuiosqueSource s = (AcentosQuiosqueSource) e.getSource();
        System.out.println("Informações dos acentos atualizadas!");
        for( Acento a : s.getAcentos() ){
            System.out.println("Situação do acento " + a.getId() + ": " + a.getSituacao());
        }
    }

    public void novaReserva(AcentosQuiosqueEvent e){
        AcentosQuiosqueSource s = (AcentosQuiosqueSource) e.getSource();
        System.out.println("Informações dos acentos atualizadas!");
        for( Acento a : s.getAcentos() ){
            System.out.println("Situação do acento " + a.getId() + ": " + a.getSituacao());
        }
    }

    public void apresentaDisposicao(AcentosOnibusSource c){
        c.getAcentos();
	}
}