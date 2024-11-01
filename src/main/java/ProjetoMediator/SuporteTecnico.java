package ProjetoMediator;

public class SuporteTecnico {

    private static SuporteTecnico instancia = new SuporteTecnico();

    private SuporteTecnico() {}

    public static SuporteTecnico getInstancia() {
        return instancia;
    }

    public String receberElogio(String mensagem) {
        return "O Suporte Técnico agradece seu contato.\n" +
                "Aqui está a resposta: " + EquipeSuporte.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacao(String mensagem) {
        return "O Suporte Técnico agradece seu contato.\n" +
                "Aqui está a resposta: " + EquipeSuporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestao(String mensagem) {
        return "O Suporte Técnico agradece seu contato.\n" +
                "Aqui está a resposta: " + EquipeSuporte.getInstancia().receberSugestao(mensagem);
    }
}
