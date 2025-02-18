package codigos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AnotacaoTest {

    private Anotacao anotacao;

    @BeforeEach
    void setUp() throws Exception {
        anotacao = new Anotacao("Minha primeira anotação", 1);
    }

    @Test
    void getId() {
        assertEquals(1, anotacao.getId());
    }

    @Test
    void getTexto() {
        assertEquals("Minha primeira anotação", anotacao.getTexto());
    }

    @Test
    void getDataDeCriacao() {
        assertEquals(LocalDate.now(), anotacao.getDataDeCriacao());
    }

    @Test
    void setTexto() throws Exception {
        anotacao.setTexto("Novo texto");
        assertEquals("Novo texto", anotacao.getTexto());
    }

    @Test
    void setTextoDeveLancarExcecaoQuandoTextoInvalido() {
        Exception exception = assertThrows(Exception.class, () -> anotacao.setTexto(" "));
        assertEquals("Texto não pode ser vazio ou nulo.", exception.getMessage());
    }

    @Test
    void contemTexto() {
        assertTrue(anotacao.contemTexto("primeira"));
        assertFalse(anotacao.contemTexto("segunda"));
    }

    @Test
    void deletar() {
        anotacao.deletar();
        assertTrue(anotacao.isDeletada());
    }

    @Test
    void isDeletada() {
        assertFalse(anotacao.isDeletada());
        anotacao.deletar();
        assertTrue(anotacao.isDeletada());
    }
}