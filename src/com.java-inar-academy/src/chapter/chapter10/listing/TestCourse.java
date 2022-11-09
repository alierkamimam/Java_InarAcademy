package chapter.chapter10.listing;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anna Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");


        System.out.println("Number of student is course1: " + course1.getNumberOfStudent());
        System.out.println(course1.getCourseName()+"\n");
        String[] student = course1.getStudents();
        System.out.println("Students:");
        for (int i = 0; i < course1.getNumberOfStudent(); i++) {
            System.out.println(student[i] + ", ");
        }
        System.out.println();
        System.out.println("");
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudent());
        System.out.println("\n"+course2.getCourseName());





    }
}
