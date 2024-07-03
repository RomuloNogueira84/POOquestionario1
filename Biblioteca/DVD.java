package Biblioteca;

 class DVD extends ItemBiblioteca {
    private String diretor;

    public DVD(String titulo, String autor, int anoPublicacao, String diretor) {
        super(titulo, autor, anoPublicacao);
        this.diretor = diretor;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        return 0.0; // Exemplo: sem multa
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("DVD: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Diretor: " + diretor);
    }

    @Override
    public String getTitulo() {
        return "";
    }

    public String getAutor() {
        return "";
    }

    public int getAnoPublicacao() {
        super.getAnoPublicacao();

        return 0;
    }

    static void main(String[] args) {
        // Exemplo de uso:
        DVD dvd = new DVD("Meu DVD", "Diretor X", 2022, "João Silva");
        dvd.imprimirDetalhes();
    }
}

