package ObjectOrientation.Exercises.Revision.Library;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Publication> {
    private List<T> booklist;

    public Library() {
        this.booklist = new ArrayList<>();
    }

    // Getters and Setters

    public List<T> getBooklist() {
        return booklist;
    }

    // Methods

    public void addPublication(T publication) {
        this.booklist.add(publication);
    }

    public void removePublication(T publication) {
        this.booklist.remove(publication);
    }

    public void listPublicationInBookList() {
        if (booklist.isEmpty()) {
            System.out.println("Library is Empty!");
            return;
        }

        for (T publication : booklist) {
            System.out.println(publication.getSummary());
        }
    }

}
