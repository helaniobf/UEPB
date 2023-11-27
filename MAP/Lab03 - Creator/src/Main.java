public class Main {
    public static void main(String[] args) {

        FigurasGeometricas figura = new FigurasGeometricas();
        Info.exibirArea(figura.quadrado);
        Info.exibirPerimetro(figura.quadrado);
        Info.exibirPorExtenso(figura.quadrado);

        Info.exibirArea(figura.circulo);
        Info.exibirPerimetro(figura.circulo);
        Info.exibirPorExtenso(figura.circulo);

        Info.exibirArea(figura.retangulo);
        Info.exibirPerimetro(figura.retangulo);
        Info.exibirPorExtenso(figura.retangulo);
        
    }
}