package ObjectOrientation.Exercises.Revision.Library;

public class Magazine extends Publication {
    public Magazine(String titlePost, String author, int yearOfPublication) {
        super(titlePost, author, yearOfPublication);
    }

    @Override
    public String getSummary() {
        return "Revista: " + this.titlePost + ", Ano de Publicação: " + this.yearOfPublication;
    }
}
