package ObjectOrientation.Exercises.Revision.Course;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private List<Course> coursesTaught;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
        this.coursesTaught = new ArrayList<>();
    }

    public static void main(String[] args) {

    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    // Methods

    public void addCourse(Course course) {
        this.coursesTaught.add(course);
    }

    public void removeCourse(Course course) {
        this.coursesTaught.remove(course);
    }

}