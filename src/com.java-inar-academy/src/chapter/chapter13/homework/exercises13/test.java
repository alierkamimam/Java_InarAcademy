package chapter.chapter13.homework.exercises13;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Course course=new Course("Cyber Security");
        course.addStudent("Erkam");
        course.addStudent("Erdem");
        course.addStudent("Tahir");
        course.addStudent("Salim");

        Course course1=(Course) course.clone();

        course1.addStudent("Mahmut");
        course1.addStudent("Gürses");

        System.out.println("Number of students course: "+course.getNumberOfStudent());
        String[] students= course.getStudents();
        for (int i = 0; i < course.getNumberOfStudent(); i++) {
            System.out.println(students[i]);
        }

        System.out.println("Number of student course1: "+course1.getNumberOfStudent());
        String[] student= course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudent(); i++) {
            System.out.println(student[i]);
        }

    }
}
