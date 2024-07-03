package Biblioteca;

public abstract class ItemBiblioteca {
    String titulo;
    private String autor;
    private int anoPublicacao;

    public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract double calcularMultaAtraso(int diasAtraso);

    public abstract void imprimirDetalhes();

    protected String getTitulo() {
            return null;
    }
    protected String getAutor() {
        return null;
    }

    protected int getAnoPublicacao() {
        return 0;

    }
}



