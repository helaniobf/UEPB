import java.util.ArrayList;

public class Funcionario {
 
    private String nome;
    private ArrayList<Funcao> funcoes;
    private String id;
    
    public Funcionario(String nome, String id){
        this.nome = nome;
        this.id = id;
        this.funcoes = new ArrayList<Funcao>();
    }

    public String getNome(){
        return this.nome;
    }

    public String getId(){
        return this.id;
    }

    public void adicionarFuncao(Funcao funcao) {
        this.funcoes.add(funcao);
    }

    public ArrayList<Funcao> getFuncoes(){
        return funcoes;
    }

}
