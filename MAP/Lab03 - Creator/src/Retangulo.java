public class Retangulo implements FiguraGeometrica{
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        if(altura <= 0 || largura <= 0){
            throw new IllegalArgumentException("Ambos os lados do retangulo devem ser maiores que zero.");
        }
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public String getTipo() {
        return "retângulo";
    }
    
    @Override
    public String porExtenso() {
        return "O retângulo criado tem altura de tamanho: " + altura + " e largura de tamanho: " + largura;
    }
}

