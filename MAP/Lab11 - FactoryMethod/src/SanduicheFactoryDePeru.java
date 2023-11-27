class SanduicheFactoryDePeru implements SanduicheFactory {
    public Sanduiche criarSanduiche() {
        return new Sanduiche(new PaoFrances(), new QueijoMussarela(), new PresuntoDePeru(), new OvoDeGranja(), new Tomate());
    }
}