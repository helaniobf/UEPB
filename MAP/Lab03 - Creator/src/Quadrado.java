public class Quadrado implements FiguraGeometrica {
    private int lado;

    public Quadrado(int lado) {
        if(lado <= 0){
            throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getTipo() {
        return "quadrado";
    }

    @Override
    public String porExtenso() {
        return "O quadrado criado tem lados de tamanho: " + lado;
    }
}
