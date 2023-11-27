public class VisitorMaximizarFigura implements Visitor{

   public Object[] visitaCirculo(Circulo c){
        return new Object[]{2 * c.getRaio()};
    }

    public Object[] visitaTriangulo(Triangulo t){
        return new Object[]{2 * t.getLado1(), t.getLado2(), t.getLado3()};
    }

    public Object[] visitaRetangulo(Retangulo r){
        return new Object[]{2 * r.getAltura(), 2 * r.getComprimento()};
    }    

    public Object[] visitaTrapezio(Trapezio t){
        return new Object[]{2 * t.getLado1(), 2 * t.getLado2(), 2 * t.getBaseMenor(), 2 * t.getBaseMaior()};
    }

}
