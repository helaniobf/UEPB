public class Main {

    public static void imprimeInfo(Object[] a){
        for( Object o : a){
            System.out.println(o + "\n");
        }
    }
    public static void main(String[] args) throws Exception {
        Visitor visitorCA = new VisitorCalcularArea();
        Visitor visitorCP = new VisitorCalcularPerimetro();
        Visitor visitorD = new VisitorDesenhar();
        Visitor visitorMF = new VisitorMaximizarFigura();

        Circulo c = new Circulo(4);
        Triangulo t = new Triangulo(5, 5, 5);
        Retangulo r = new Retangulo(3, 2);
        Trapezio p = new Trapezio(4, 3, 5, 2, 2);

        //Imprimindo as informações do Circulo usando Visitor
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\nFigura: Círculo\n\nÁrea: ");
        imprimeInfo(c.aceitaVisita(visitorCA));
        System.out.print("Perímetro: ");
        imprimeInfo(c.aceitaVisita(visitorCP));
        System.out.println("Representação:\n");
        imprimeInfo(c.aceitaVisita(visitorD));
        System.out.println("Duplicação das Dimensões(raio):\n");
        imprimeInfo(c.aceitaVisita(visitorMF));

        //Imprimindo as informações do Triangulo usando Visitor
        System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\nFigura: Triângulo\n\nÁrea: ");
        imprimeInfo(t.aceitaVisita(visitorCA));
        System.out.print("Perímetro: ");
        imprimeInfo(t.aceitaVisita(visitorCP));
        System.out.println("Representação:\n");
        imprimeInfo(t.aceitaVisita(visitorD));
        System.out.println("Duplicação das Dimensões(lado1, lado2, lado3):\n");
        imprimeInfo(t.aceitaVisita(visitorMF));

        //Imprimindo as informações do Retangulo usando Visitor
        System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\nFigura: Retângulo\n\nÁrea: ");
        imprimeInfo(r.aceitaVisita(visitorCA));
        System.out.print("Perímetro: ");
        imprimeInfo(r.aceitaVisita(visitorCP));
        System.out.println("Representação:\n");
        imprimeInfo(r.aceitaVisita(visitorD));
        System.out.println("Duplicação das Dimensões(altura, comprimento):\n");
        imprimeInfo(r.aceitaVisita(visitorMF));

        //Imprimindo as informações do Trapezio usando Visitor
        System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\nFigura: Trapézio\n\nÁrea: ");
        imprimeInfo(p.aceitaVisita(visitorCA));
        System.out.print("Perímetro: ");
        imprimeInfo(p.aceitaVisita(visitorCP));
        System.out.println("Representação:\n");
        imprimeInfo(p.aceitaVisita(visitorD));
        System.out.println("Duplicação das Dimensões(lado1, lado2, base menor, base maior):\n");
        imprimeInfo(p.aceitaVisita(visitorMF));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

    }
}
