package chapter.chapter11.homework.ex02;

public class Staff extends Employee {
    private String title;


    public Staff() {
        this(null, null, null, null, null, 0, null);
    }

    public Staff(String name, String address, String phoneNumber, String e_mail, String office, int salary, String title) {
        super(name, address, phoneNumber, e_mail, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle:" + this.title;
    }
}
