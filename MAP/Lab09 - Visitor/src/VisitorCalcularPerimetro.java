public class VisitorCalcularPerimetro implements Visitor{
    
    public Object[] visitaCirculo(Circulo c){
        return new Object[]{2 * Math.PI * c.getRaio()};
    }

    public Object[] visitaTriangulo(Triangulo t){
        return new Object[]{t.getLado1() + t.getLado2() + t.getLado3()};
    }

    public Object[] visitaRetangulo(Retangulo r){
        return new Object[]{r.getAltura() + r.getComprimento()};
    }    

    public Object[] visitaTrapezio(Trapezio t){
        return new Object[]{t.getLado1() + t.getLado2() + t.getBaseMenor() + t.getBaseMaior()};
    }

}
