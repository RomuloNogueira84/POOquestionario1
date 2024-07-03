package Biblioteca;
public class Livro extends ItemBiblioteca {
    private GeneroLivro genero;

    public Livro(String titulo, String autor, int anoPublicacao, GeneroLivro genero) {
        super(titulo, autor, anoPublicacao);
        this.genero = genero;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        // Implemente a lógica para calcular a multa específica para livros
        return 0.0; // Exemplo: sem multa
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Gênero: " + genero.getDescricao());
    }

    public String getTitulo() {
        return super.getTitulo(); // Use o método da classe base
    }

    public String getAutor() {
        return super.getAutor(); // Use o método da classe base
    }

    public int getAnoPublicacao() {
        return super.getAnoPublicacao();
    }
}
