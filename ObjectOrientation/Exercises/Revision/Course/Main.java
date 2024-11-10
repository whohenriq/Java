package ObjectOrientation.Exercises.Revision.Course;

import java.util.List;

public class Main {

    // Methods

    public static void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
    }

    public static void associateTeacherInCourse(Teacher teacher, Course course) {
        teacher.addCourse(course);
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
