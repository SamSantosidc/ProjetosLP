package codigos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BlocoDeNotasTest {

    private BlocoDeNotas bloco;

    @BeforeEach
    void setUp() {
        bloco = new BlocoDeNotas();
    }

    @Test
    void addAnotacao() throws Exception {
        Anotacao anotacao = bloco.addAnotacao("Nova anotação");
        assertNotNull(anotacao);
        assertEquals(1, anotacao.getId());
    }

    @Test
    void buscaAnotacao() throws Exception {
        bloco.addAnotacao("Teste de busca");
        assertNotNull(bloco.buscaAnotacao(1));
        assertNull(bloco.buscaAnotacao(2));
    }

    @Test
    void editarAnotacao() throws Exception {
        bloco.addAnotacao("Texto antigo");
        Anotacao editada = bloco.editarAnotacao(1, "Texto novo");
        assertEquals("Texto novo", editada.getTexto());
    }

    @Test
    void recuperarPorTexto() throws Exception {
        bloco.addAnotacao("Primeira anotação");
        bloco.addAnotacao("Segunda anotação");
        List<Anotacao> resultado = bloco.recuperarPorTexto("Segunda");
        assertEquals(1, resultado.size());
    }

    @Test
    void listar() throws Exception {
        bloco.addAnotacao("Anotação 1");
        bloco.addAnotacao("Anotação 2");
        assertEquals(2, bloco.listar().size());
    }
}