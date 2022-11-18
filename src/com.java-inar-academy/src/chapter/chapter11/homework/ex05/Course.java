package chapter.chapter11.homework.ex05;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;

    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students.add(student);

    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void dropStudent(String student) {
        if (!students.contains(student)) {
            System.out.println(student + " is not in the course");
        }
            students.remove(student);
    }

    public String toString() {
        return students.toString();
    }

}
