public class Retangulo implements ElementoConcretoIF {

    double comprimento;
    double altura;

    public Retangulo(double comprimento, double altura) throws IllegalArgumentException {

        if( comprimento > 0 && altura > 0){
            this.comprimento = comprimento;
            this.altura = altura;
        }
        else{
            throw new IllegalArgumentException();
        }
        
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public Object[] aceitaVisita(Visitor v) {
        return v.visitaRetangulo(this);
    }
}