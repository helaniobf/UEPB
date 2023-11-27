public class Circulo implements ElementoConcretoIF{

    double raio;

    public Circulo(double r) throws IllegalArgumentException{

        if( r > 0 ){
            this.raio = r;
        }
        else{
            throw new IllegalArgumentException();
        }
        
    }

    public double getRaio() {
        return this.raio;
    }

    public Object[] aceitaVisita(Visitor v){
        return v.visitaCirculo(this);
    }

    /*public Circulo(double r) throws IllegalArgumentException {
        try{
            if( r > 0 ){
                this.raio = r;
            }
            else{
                throw new IllegalArgumentException();
            }

        }
        catch(Exception e){
            System.out.println("O raio do círculo não pode ser menor ou igual a 0.");;
        }
    }*/
}
