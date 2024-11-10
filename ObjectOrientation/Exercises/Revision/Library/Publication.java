package ObjectOrientation.Exercises.Revision.Library;

public abstract class Publication {
    String titlePost;
    String author;
    int yearOfPublication;

    public Publication(String titlePost, String author, int yearOfPublication) {
        this.titlePost = titlePost;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getSummary() {
        return "Título da Publicação: " + this.titlePost + ", Nome do Autor: " + this.author + ", Data da Publicação: "
                + this.yearOfPublication;
    }

}
