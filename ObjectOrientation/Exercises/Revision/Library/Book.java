package ObjectOrientation.Exercises.Revision.Library;

public class Book extends Publication {

    public Book(String titlePost, String author, int yearOfPublication) {
        super(titlePost, author, yearOfPublication);
    }

    @Override
    public String getSummary() {
        return "Livro: " + this.titlePost + ", Autor: " + this.author;
    }
}
