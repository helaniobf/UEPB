public class Filme {
    private String nome;
    private int ano;
    private Equipe equipe;

    public Filme( String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public Equipe getEquipe(){
        return equipe;
    }

    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }

}
