public class Quadrado implements FiguraGeometrica {
   
    double lado;
    double area;
    double perimetro;

    public Quadrado(double lado){
        if(quadradoPossivel(lado)){
            this.lado = lado;
            this.area = area();
            this.perimetro = perimetro();
        }
    }

    public double area(){
        return lado * lado;
    }

    public double perimetro(){
        return 4 * lado;
    }

    public String getInfo(){
        return "Informacoes do Quadrado:\nlado: " + lado + "\narea: " + area + "\nperimetro: " + perimetro + "\n";
    }

    public boolean quadradoPossivel(double lado){
        if(lado > 0){
            return true;
        }
        throw new IllegalArgumentException();
    }

}
