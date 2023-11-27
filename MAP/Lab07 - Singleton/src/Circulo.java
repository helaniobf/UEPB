public class Circulo implements FiguraGeometrica {
    
    double raio;
    double area;
    double perimetro;
    private static Circulo instanciaUnicaCirculo = null;

    private Circulo(double raio){
        this.raio = raio;
        this.area = area();
        this.perimetro = perimetro();
    }

    public static Circulo SingletonCirculo(double raio){
        try{
            if(instanciaUnicaCirculo == null && circuloPossivel(raio)){
                instanciaUnicaCirculo = new Circulo(raio);
                return instanciaUnicaCirculo;
            }
            throw new IllegalArgumentException();
        }
        catch(Exception e){
            System.out.println("Já exixte uma instância de círculo");
            return null;
        }
    }

    public double area(){
        return Math.PI *  Math.pow(raio, 2);
    }

    public double perimetro(){
        return 2 * Math.PI * raio;
    }

    public String getInfo(){
        return "Informacoes do Circulo:\nraio: " + raio + "\narea: " + area + "\nperimetro: " + perimetro + "\n";
    }

    public static boolean circuloPossivel(double raio){
        if(raio > 0){
            return true;
        }
        return false;
    }

}
