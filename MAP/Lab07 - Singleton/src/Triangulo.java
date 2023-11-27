public class Triangulo implements FiguraGeometrica {
    
    private double lado1;
    private double lado2;
    private double lado3;
    private static Triangulo instanciaUnicaEquilatero = null;
    private static Triangulo instanciaUnicaIsosceles = null;
    private static Triangulo instanciaUnicaEscaleno = null;

    double area;
    double perimetro;

    private Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.area = area();
        this.perimetro = perimetro();
    }

    public static Triangulo SingletonTriangulo(double lado1, double lado2, double lado3){
        try{
            if( tipoDoTriangulo(lado1, lado2, lado3).equals("Equilátero") && desigualdadeTriangular(lado1, lado2, lado3) && instanciaUnicaEquilatero == null ){
            instanciaUnicaEquilatero = new Triangulo(lado1, lado2, lado3);
                return instanciaUnicaEquilatero;
            }
            if( tipoDoTriangulo(lado1, lado2, lado3).equals("Isósceles") && desigualdadeTriangular(lado1, lado2, lado3) && instanciaUnicaIsosceles == null ){
                instanciaUnicaIsosceles = new Triangulo(lado1, lado2, lado3);
                return instanciaUnicaIsosceles;
            }
            if( tipoDoTriangulo(lado1, lado2, lado3).equals("Escaleno") && desigualdadeTriangular(lado1, lado2, lado3) && instanciaUnicaEscaleno == null ){
                instanciaUnicaEscaleno = new Triangulo(lado1, lado2, lado3);
                return instanciaUnicaEscaleno;
            }
            throw new IllegalArgumentException();
        }
        catch(Exception e){
            System.out.println("Já exixte uma instância de triângulo " + tipoDoTriangulo(lado1, lado2, lado3) + " ou a desigualdade triangular não foi atendida.");
            return null;
        }
    }

    public double area(){
        //Fórmula de Herón
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt( s * (s - lado1) * (s - lado2) * (s - lado3) );
    }

    public double perimetro(){
        return lado1 + lado2 + lado3;
    }

    public String getInfo(){
        return "Informacoes do Triangulo " + tipoDoTriangulo(lado1, lado2, lado3) + ":\nlados:\na: " + lado1 + "\nb: " + lado2 + "\nc: " + lado3 + "\narea: " + area + "\nperimetro: " + perimetro + "\n";
    }

    public static String tipoDoTriangulo(double lado1, double lado2, double lado3){
        if( lado1 == lado2 && lado2 == lado3 ){
            return "Equilátero";    
        }
        else if( lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            return "Isósceles";
        }
        else
            return "Escaleno";
    }

    public static boolean desigualdadeTriangular(double lado1, double lado2, double lado3){
        if( (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2) ){
            return true;
        }
        return false;
    }

}
