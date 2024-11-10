package ObjectOrientation.Exercises.Revision.Course;

public class Course {
    private int id;
    private String name;
    private int durationHours;

    public Course(int id, String name, int durationHours) {
        this.id = id;
        this.name = name;
        this.durationHours = durationHours;
    }

    public static void main(String[] args) {

    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(int durationHours) {
        this.durationHours = durationHours;
    }
}
