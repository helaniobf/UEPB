public class Triangulo implements ElementoConcretoIF {

    double lado1;
    double lado2;
    double lado3;

    public Triangulo(double lado1, double lado2, double lado3) throws IllegalArgumentException {

        if( lado1 > 0 && lado2 > 0 && lado3 > 0 && (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)){
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
        else{
            throw new IllegalArgumentException();
        }
        
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double getLado3() {
        return this.lado3;
    }

    public Object[] aceitaVisita(Visitor v) {
        return v.visitaTriangulo(this);
    }
}
