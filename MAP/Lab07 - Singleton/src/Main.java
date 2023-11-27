public class Main {
    public static void main(String[] args) throws Exception {
        
        Triangulo equilatero1 = Triangulo.SingletonTriangulo(3, 3, 3);
        System.out.println(equilatero1.getInfo());

        Triangulo isosceles1 = Triangulo.SingletonTriangulo(1, 2, 2);
        System.out.println(isosceles1.getInfo());
        
        Triangulo escaleno1 = Triangulo.SingletonTriangulo(4, 5, 7);
        System.out.println(escaleno1.getInfo());

        Circulo circulo1 = Circulo.SingletonCirculo(4);
        System.out.println(circulo1.getInfo());

        Quadrado quadrado1 = new Quadrado(5);
        System.out.println(quadrado1.getInfo());

        //Impossível
        Triangulo escaleno2 = Triangulo.SingletonTriangulo(4, 5, 7);
        Circulo circulo2 = Circulo.SingletonCirculo(2);
        Quadrado quadrado2 = new Quadrado(-2);
        
    }
}
