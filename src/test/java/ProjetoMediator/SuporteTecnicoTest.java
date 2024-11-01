package ProjetoMediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SuporteTecnicoTest {

    @Test
    public void testElogioSuporte() {
        Usuario usuario = new Usuario();
        String mensagemElogio = "Excelente atendimento!";
        String resposta = usuario.elogiarSuporte(mensagemElogio);

        assertEquals("O Suporte Técnico agradece seu contato.\n" +
                "Aqui está a resposta: A equipe de suporte agradece a mensagem: " +
                mensagemElogio, resposta);
    }

    @Test
    public void testReclamacaoSuporte() {
        Usuario usuario = new Usuario();
        String mensagemReclamacao = "O sistema ficou fora do ar.";
        String resposta = usuario.reclamarSuporte(mensagemReclamacao);

        assertEquals("O Suporte Técnico agradece seu contato.\n" +
                "Aqui está a resposta: A equipe de suporte vai analisar a reclamação: " +
                mensagemReclamacao, resposta);
    }

    @Test
    public void testSugestaoSuporte() {
        Usuario usuario = new Usuario();
        String mensagemSugestao = "Seria bom ter um chat ao vivo.";
        String resposta = usuario.sugerirSuporte(mensagemSugestao);

        assertEquals("O Suporte Técnico agradece seu contato.\n" +
                "Aqui está a resposta: A equipe de suporte vai considerar a sugestão: " +
                mensagemSugestao, resposta);
    }
}
