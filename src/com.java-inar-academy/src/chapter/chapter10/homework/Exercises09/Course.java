package chapter.chapter10.homework.Exercises09;

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
        if (numberOfStudent >= students.length) {
            String[] temp = new String[students.length * 2 + 1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }

        students[numberOfStudent] = student;
        numberOfStudent++;
    }


    public String[] getStudents() {
        return this.students;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public void dropStudent(String name) {

        int index = findIndex(name, students);
        for (int i = index; i < numberOfStudent; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudent--;


    }

    public void clear() {
        students = new String[100];
        numberOfStudent = 0;
    }

    public static int findIndex(String name, String[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                return i;
            }

        }
        return -1;
    }

    public String ToString() {
        if (students[0] == null) {
            System.out.println("There are no students on the course at the moment");
        }
        String result = "";
        for (int i = 0; i < numberOfStudent; i++) {
            if (i == numberOfStudent - 1) {
                result += students[i];
            } else {
                result += students[i] + " , ";

            }
        }
        return "{"+ result +"}";
    }
}