import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<String> livros = new ArrayList<>();

    public void adicionarLivro(String nome) {
        livros.add(nome);
    }

    public boolean removerLivro(String nome) {
        return livros.remove(nome);
    }

    public List<String> listarLivros() {
        return livros;
    }
}
