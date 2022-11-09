package chapter.chapter10.listing;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudent;


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudent] = student;
        numberOfStudent++;
    }

    public String[] getStudents() {
        return this.students;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public void dropStudent(String student) {

    }
}
