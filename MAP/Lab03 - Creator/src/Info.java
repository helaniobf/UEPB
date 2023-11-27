public class Info {
    public static void exibirArea(FiguraGeometrica figura) {
        System.out.println("A área desse " + figura.getTipo() + " é: " + figura.calcularArea());
    }

    public static void exibirPerimetro(FiguraGeometrica figura) {
        System.out.println("O perímetro desse "+ figura.getTipo() +" é: " + figura.calcularPerimetro());
    }

    public static void exibirPorExtenso(FiguraGeometrica figura){
        System.out.println(figura.porExtenso());
    }
}

