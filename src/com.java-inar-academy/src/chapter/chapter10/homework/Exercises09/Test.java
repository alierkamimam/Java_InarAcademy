package chapter.chapter10.homework.Exercises09;

public class Test {
    public static void main(String[] args) {
        Course course=new Course("Data Science");
        course.addStudent("Erkam");
        course.addStudent("Mustafa");
        course.addStudent("Eren");
        course.dropStudent("Mustafa");
        System.out.println(course.ToString());

    }
}
