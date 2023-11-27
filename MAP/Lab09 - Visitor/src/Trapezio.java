public class Trapezio implements ElementoConcretoIF {

    double baseMaior;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    public Trapezio(double baseMaior, double baseMenor, double altura, double lado1, double lado2) throws IllegalArgumentException {

        if( baseMaior > 0 && baseMenor > 0 && altura > 0 && lado1 > 0 && lado2 > 0 && (lado1 < lado2 + baseMaior) && (lado2 < lado1 + baseMaior)){
            this.baseMaior = baseMaior;
            this.baseMenor = baseMenor;
            this.altura = altura;
            this.lado1 = lado1;
            this.lado2 = lado2;
        }
        else{
            throw new IllegalArgumentException();
        }
        
    }

    public double getBaseMaior() {
        return this.baseMaior;
    }

    public double getBaseMenor() {
        return this.baseMenor;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public Object[] aceitaVisita(Visitor v) {
        return v.visitaTrapezio(this);
    }
}
