package Biblioteca;

public enum GeneroLivro {
    FICCAO("Ficção"),
    NAO_FICCAO("Não-Ficção"),
    CIENTIFICO("Científico");

    private final String descricao;

    GeneroLivro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}


