public class Main {
    public static void main(String[] args) throws Exception {
        //Administrativo
        System.out.println("Administrativo:\n" + SIG.obterReunioes() + "\n" + SIG.obterEntrevistas() + "\n");
        
        //Financeiro
        System.out.println("Financeiro:\n" + SIG.obterBalancoDeContas() + "\n" + SIG.obterFolhaDePagamento() + "\n");
        
        //Docente
        System.out.println("Docente:\n" + SIG.obterDisciplinas() + "\n" + SIG.obterTempoDeCasa() + "\n");
    
        //Discente
        System.out.println("Discente:\n" + SIG.obterHistorico() + "\n" + SIG.obterRDM() + "\n");

        //Almoxarifado
        System.out.println("Almoxarifado:\n" + SIG.obterEstoque() + "\n" + SIG.obterPedidosDeCompra() + "\n");

        //Infra-estrutura
        System.out.println("Infra-estrutura:\n" + SIG.obterAlocacoesDeSala());

    }
}
