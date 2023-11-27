public final class SIG {
    
    static Administrativo administrativo = new Administrativo();
    static Financeiro financeiro = new Financeiro();
    static Docente docente = new Docente();
    static Discente discente = new Discente();
    static Almoxarifado almoxarifado = new Almoxarifado();
    static Infra_estrutura infraEstrutura = new Infra_estrutura();

    //Administrativo
    public static String obterReunioes(){
        return administrativo.obterReunioes();
    }

    public static String obterEntrevistas(){
        return administrativo.obterEntrevistas();
    }

    //Financeiro 
    public static String obterBalancoDeContas(){
        return financeiro.obterBalancoDeContas();
    }

    public static String obterFolhaDePagamento(){
        return financeiro.obterFolhaDePagamento();
    }

    //Docente    
    public static String obterDisciplinas(){
        return docente.obterDisciplinas();
    }

    public static String obterTempoDeCasa(){
        return docente.obterTempoDeCasa();
    }

    //Discente
    public static String obterHistorico(){
        return discente.obterHistorico();
    }

    public static String obterRDM(){
        return discente.obterRDM();
    }

    //Almoxarifado
    public static String obterEstoque(){
        return almoxarifado.obterEstoque();
    }   

    public static String obterPedidosDeCompra(){
        return almoxarifado.obterPedidosDeCompra();
    } 
    
    //Infra-estrutura
    public static String obterAlocacoesDeSala(){
        return infraEstrutura.obterAlocacoesDeSala();
    }
}
