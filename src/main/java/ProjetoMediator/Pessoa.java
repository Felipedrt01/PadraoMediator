package ProjetoMediator;

public class Pessoa {

    public String elogiarSuporte(String mensagem) {
        return SuporteTecnico.getInstancia().receberElogio(mensagem);
    }

    public String reclamarSuporte(String mensagem) {
        return SuporteTecnico.getInstancia().receberReclamacao(mensagem);
    }

    public String sugerirSuporte(String mensagem) {
        return SuporteTecnico.getInstancia().receberSugestao(mensagem);
    }
}
