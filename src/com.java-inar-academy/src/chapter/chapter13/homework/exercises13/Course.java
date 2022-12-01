package chapter.chapter13.homework.exercises13;

import chapter.chapter13.homework.exercises11.Octagon;

public class Course implements Cloneable {
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
        // Left as an exercise in Programming Exercise 10.9
    }

    @Override
    public Course clone() throws CloneNotSupportedException {

        Course courseClone = (Course) super.clone();

        courseClone.students = students.clone();

        return courseClone;
    }

}
