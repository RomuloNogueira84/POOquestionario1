package Biblioteca;

public class Revista extends ItemBiblioteca {
    private int numeroEdicao;

    public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao) {
        super(titulo, autor, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        // Implemente a lógica para calcular a multa específica para revistas
        return 0.0; // Exemplo: sem multa
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Revista: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Número da Edição: " + numeroEdicao);
    }

    public int getAnoPublicacao() {
        super.getAnoPublicacao();
        return 0;
    }
}
