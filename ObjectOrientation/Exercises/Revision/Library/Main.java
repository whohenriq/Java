package ObjectOrientation.Exercises.Revision.Library;

public class Main {
    public static void main(String[] args) {
        Library<Publication> biblioteca = new Library<>();

        Book livro = new Book("Clean Code", "Robert Cecil Martin", 2008);
        Magazine revista = new Magazine("National Geographic", "Vários Autores", 2023);

        biblioteca.addPublication(livro);
        biblioteca.addPublication(revista);

        System.out.println("Lista de publicações na biblioteca:");
        biblioteca.listPublicationInBookList();

        biblioteca.removePublication(livro);

        System.out.println("\nLista de publicações após remover o livro:");
        biblioteca.listPublicationInBookList();
    }
}
