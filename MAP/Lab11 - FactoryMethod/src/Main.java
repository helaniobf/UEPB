public class Main {

    public static void main(String[] args) {
        // Criando sanduíches usando Factory Method
        SanduicheFactory sandubaFactory1 = new SanduicheFactoryDeFrango();
        SanduicheFactory sandubaFactory2 = new SanduicheFactoryDePeru();
        SanduicheFactory sandubaFactory3 = new SanduicheFactoryDeCheddar();

        Sanduiche sanduiche1 = sandubaFactory1.criarSanduiche();
        Sanduiche sanduiche2 = sandubaFactory2.criarSanduiche();
        Sanduiche sanduiche3 = sandubaFactory3.criarSanduiche();

        // Mostrando os ingredientes de cada sanduíche
        System.out.println(sanduiche1.mostrarIngredientes());
        System.out.println(sanduiche2.mostrarIngredientes());
        System.out.println(sanduiche3.mostrarIngredientes());
    }
}