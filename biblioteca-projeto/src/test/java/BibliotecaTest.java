import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    void testeRemoverLivroInexistente() {
        biblioteca.adicionarLivro("O Programador Pragmático");

        boolean foiRemovido = biblioteca.removerLivro("O Livro Que Não Existe");

        assertFalse(foiRemovido);
        assertEquals(1, biblioteca.listarLivros().size());
    }
}
