public class Circulo implements FiguraGeometrica {
    private int raio;

    public Circulo(int raio) throws IllegalArgumentException {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser maior que zero.");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String getTipo() {
        return "circulo";
    }

    @Override
    public String porExtenso() {
        return "O circulo criado tem raio de tamanho: " + raio;
    }
    
}