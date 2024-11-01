package ProjetoMediator;

public class EquipeSuporte implements Setor {

    private static EquipeSuporte instancia = new EquipeSuporte();

    private EquipeSuporte() {}

    public static EquipeSuporte getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A equipe de suporte vai analisar a reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A equipe de suporte agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A equipe de suporte vai considerar a sugestão: " + mensagem;
    }
}
