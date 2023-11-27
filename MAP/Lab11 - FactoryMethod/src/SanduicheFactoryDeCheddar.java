class SanduicheFactoryDeCheddar implements SanduicheFactory {
    public Sanduiche criarSanduiche() {
        return new Sanduiche(new PaoBola(), new QueijoCheddar(), new PresuntoDeFrango(), new OvoDeCapoeira(), new Tomate());
    }
}