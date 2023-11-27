public class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Ovo ovo;
    private Tomate tomate;

    public Sanduiche(Pao pao, Queijo queijo, Presunto presunto, Ovo ovo, Tomate tomate) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.ovo = ovo;
        this.tomate = tomate;
    }

    public String mostrarIngredientes() {
        return "Ingredientes do Sanduíche de " + queijo.tipo() + " com " + presunto.tipo() + 
        "\n- Pão: " + pao.tipo() + 
        "\n- Queijo: " + queijo.tipo() + 
        "\n- Presunto: " + presunto.tipo() +
        "\n- Ovo: " + ovo.tipo() +
        "\n- Tomate: " + tomate.tipo();
    }
}
