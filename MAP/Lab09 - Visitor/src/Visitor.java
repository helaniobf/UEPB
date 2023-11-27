public interface Visitor {
    
    public Object[] visitaCirculo(Circulo c );
    public Object[] visitaTriangulo(Triangulo t);
    public Object[] visitaRetangulo(Retangulo r);
    public Object[] visitaTrapezio(Trapezio t);

}
