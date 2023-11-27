class SanduicheFactoryDeFrango implements SanduicheFactory {
    public Sanduiche criarSanduiche() {
        return new Sanduiche(new PaoIntegral(), new QueijoPrato(), new PresuntoDeFrango(), new OvoDeCapoeira(), new Tomate());
    }
}
