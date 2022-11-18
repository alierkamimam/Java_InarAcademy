package chapter.chapter11.homework.ex02;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        Student student=new Student("junior","Erkam","Ankara","312 45 67 ","erkam@gmail.com");
        System.out.println(student.toString());
        System.out.println("---------------------------");

        Employee employee=new Employee("Erkam","Ankara","312 45 67 ","erkam@gmail.com","ScriptSyber",1000);
        System.out.println(employee.toString());
        System.out.println("---------------------------");

        Faculty faculty=new Faculty("Erkam","Ankara","312 45 67 ","erkam@gmail.com","ScriptSyber",1000,5,6);
        System.out.println(faculty.toString());
        System.out.println("---------------------------");

        Staff staff=new Staff("Merve","Ankara","1223456","Merve@gmail.com","Keçiören",5000,"Student");
        System.out.println(staff.toString());
    }
}
