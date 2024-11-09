package ObjectOrientation;

import java.util.ArrayList;
import java.util.List;

class Course {
    private int id;
    private String name;
    private int durationHours;

    public Course(int id, String name, int durationHours) {
        this.id = id;
        this.name = name;
        this.durationHours = durationHours;
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

class Teacher {
    private int id;
    private String name;
    private List<Course> coursesTaught;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
        this.coursesTaught = new ArrayList<>();
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

    public void addCurse(Course course) {
        this.coursesTaught.add(course);
    }

    public void removeCourse(Course course) {
        this.coursesTaught.remove(course);
    }

}

class Student {
    private int id;
    private String name;
    private List<Course> coursesEnrolled;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.coursesEnrolled = new ArrayList<>();
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

public class CoursesPOO {

    // Methods

    public static void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
    }

    public static void associateTeacherInCourse(Teacher teacher, Course course) {
        teacher.addCurse(course);
    }

    public static void displayCourseStudents(Course course, List<Student> students) {
        System.out.println("Alunos matriculados no curso " + course.getName() + ":");

        for (Student student : students) {
            if (student.getCoursesEnrolled().contains(course)) {
                System.out.println(student.getName());
            }
        }
    }

    public static void displayCoursesTaughtByTeacher(Teacher teacher) {
        System.out.println("Cursos ministrados por " + teacher.getName() + ":");

        for (Course course : teacher.getCoursesTaught()) {
            System.out.println(course.getName());
        }
    }

    public static void main(String[] args) {
        Course course1 = new Course(101, "java", 120);
        Course course2 = new Course(102, "python", 120);
        Course course3 = new Course(103, "typescript", 120);

        Teacher teacher1 = new Teacher(10, "JEFF");
        Teacher teacher2 = new Teacher(20, "Aluisio");
        Teacher teacher3 = new Teacher(30, "Irlan");

        Student student1 = new Student(003, "Henrique");
        Student student2 = new Student(002, "Eduardo");
        Student student3 = new Student(004, "Silva");

        associateTeacherInCourse(teacher1, course1);
        associateTeacherInCourse(teacher2, course2);
        associateTeacherInCourse(teacher3, course3);

        enrollStudentInCourse(student3, course3);
        enrollStudentInCourse(student2, course3);
        enrollStudentInCourse(student1, course3);

        displayCourseStudents(course3, List.of(student3, student2));
        displayCoursesTaughtByTeacher(teacher3);
    }

}
