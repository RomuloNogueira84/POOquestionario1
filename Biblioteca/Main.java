package Biblioteca;

import java.awt.print.Book;

public class Main {
    private static String[] args;
    private static Object lms;

    public static <LibraryManagementSystem> void main(String[] args) {
        lms = new LibraryManagementSystem();
        lms.getClass();


        // Adicionar novos livros
        lms.getClass( new Livro("Aprenda Java", "John Doe", 2022, GeneroLivro.FICCAO));
        lms.getClass( new Livro("Aprenda Java", "John Doe", 2022, GeneroLivro.FICCAO));
        lms.getClass(new Livro("Aprenda Java", "John Doe", 2022, GeneroLivro.FICCAO));



        lms.getClass ();
    }

}

