package chapter.chapter11.homework.ex05;

public class test {
    public static void main(String[] args) {
        Course course = new Course("Math");
        course.addStudent("Erkam");
        course.addStudent("Sinan");
        course.addStudent("Burak");
        System.out.println(course.getCourseName());
        System.out.println(course.getNumberOfStudents());
        System.out.println(course.toString());
        System.out.println("----------------");
        course.dropStudent("Mustafa");
        course.dropStudent("Erkam");
        System.out.println(course.getNumberOfStudents());
        System.out.println(course.toString());


    }
}
