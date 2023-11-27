public class VisitorCalcularArea implements Visitor {
    
    public Object[] visitaCirculo(Circulo c){
        return new Object[]{Math.PI * c.getRaio()};
    }

    public Object[] visitaTriangulo(Triangulo t){
        double s = (t.getLado1() + t.getLado2() + t.getLado3()) / 2;
        double area = Math.sqrt(s * (s - t.getLado1()) * (s - t.getLado2()) * (s - t.getLado3()));
        return new Object[]{area};
    }

    public Object[] visitaRetangulo(Retangulo r){
        return new Object[]{r.getAltura() * r.getComprimento()};
    }    

    public Object[] visitaTrapezio(Trapezio t){
        return new Object[]{(((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) /2 )};
    }

}
