package ObjectOrientation.Exercises.Revision.Course;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Course> coursesEnrolled;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.coursesEnrolled = new ArrayList<>();
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

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    // Methods

    public void enrollInCourse(Course course) {
        this.coursesEnrolled.add(course);
    }

    public void lockCourse(Course course) {
        this.coursesEnrolled.remove(course);
    }

}